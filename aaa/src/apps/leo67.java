package apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class leo67 {

	public static void main(String[] args) {
		
		//連接遠端 拿到資料 
		
		try {
		URL url = new URL("http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");				//1.抓資料
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.connect();
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(conn.getInputStream()));								//--1
		StringBuffer sb = new StringBuffer();																	//2.把資料放進SB
		String line ;
		while ( (line = reader.readLine()) != null) {
			sb.append(line);																					//--2
		}
		
		reader.close();
		System.out.println("Step 1 OK");
		parseJSON(sb.toString());																				//3.上面做完了我們就走parseJSON的任務
		}catch (Exception e ) {
			System.out.println(e.toString());
		}
	}
	
	static void parseJSON(String json) {
//		System.out.println(json);
		//我的json格式第一個是[]陣列
		try {

			Properties prop = new Properties();							//6						
			prop.put("user","root");
			prop.put("password","root");
			prop.put("serverTimezone","Asia/Taipei");
			Connection conn = 
			DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/iii",prop);			//--6
			String sql = "INSERT INTO food(fname,tel,addr,city,town,lat,lng,pic)" +  //7  避免 隱碼攻擊 使用preparedstatement
						" VALUES(?,?,?,?,?,?,?,?)";							
		    PreparedStatement pstmt = conn.prepareStatement(sql) ;		//  --7  values 就是問號！！
			
			
			
			JSONArray root = new JSONArray(json);		//4.java本身是拋出一班的exception 但在安啅會強制拋出例外 所以還是try一下
//			System.out.println(root.length());
			for (int i =0 ;i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String fname =row.getString("Name");
				String tel =row.getString("Tel");
				String addr =row.getString("Address");
				String city =row.getString("City");
				String town =row.getString("Town");
				String latlng =row.getString("Coordinate"); //5 經緯度可能會有或沒有 有的話用逗號隔開 沒有的話用try catch 
				String lat = "" , lng = "";
				try {										//如果有一筆經緯度沒有 我依然能繼續做
					String[] coor = latlng.split(",");		//用,區隔開 分別放在陣列內 split 
					lat = coor[0];
					lng = coor[1];
				}catch(Exception e) {
					lat = lng = "";							//--5
				}
				String pic =row.getString("PicURL");		//--4
				
				pstmt.setString(1, fname);					//8.
				pstmt.setString(2, tel);
				pstmt.setString(3, addr);
				pstmt.setString(4, city);
				pstmt.setString(5, town);
				pstmt.setString(6, lat);
				pstmt.setString(7, lng);
				pstmt.setString(8, pic);
				pstmt.executeUpdate();						//--8 該丟的丟了   最後 update上去資料庫
			}
			System.out.println("step 2 OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
