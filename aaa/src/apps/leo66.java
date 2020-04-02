package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
  //資料庫搞起來 設定連線 增加資料 刪除 修改 查詢...
public class leo66 {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");		
//			//mysql 5 的驅動程式是 com.mysql.jdbc.Driver 用這樣會顯示錯誤 要求你輸入新的driver 目前新版的是8 驅動是 com.mysql.cj.jdbc.Driver
//			//新版java甚至不用寫這段try catch
//			//到目前為止我利用他的驅動成式 可產生連線 但還沒使用 呼叫ＡＰＩ要用java.sql
//			System.out.println("OK");
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		try {
//		Connection conn = DriverManager.getConnection(    //port號查mamp內的mysql的port號  user password都是root   	//第一招
//				"jdbc:mysql://localhost:8889/iii?"+
//				"user=root&password=root&serverTimezone=Asia/Taipei");
		
//		Connection conn = 
//				DriverManager.getConnection("jdbc:mysql://localhost:8889/iii?serverTimezone=Asia/Taipei","root","root");  //第二招
		
			
		Properties prop = new Properties();											//第三招 透過properties 的物件放進connection內的屬性
		prop.put("user","root");
		prop.put("password","root");
		prop.put("serverTimezone","Asia/Taipei");
		Connection conn = 
				DriverManager.getConnection(
						"jdbc:mysql://localhost:8889/iii",prop);
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("INSERT INTO cust (cname,tel,birthday)"				//增加
		+" VALUES ('資策會','11156','1989-01-02')");			
		
//		stmt.executeUpdate("DELETE FROM cust WHERE id = 2");					//刪除
		
//		stmt.executeUpdate("UPDATE cust SET cname='Peter',tel='312' WHERE id =1");    //修改
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM cust");					//查詢
		
		while(rs.next()) {
			String id = rs.getString("id");							//原本資料庫id的型別是int 但我是寫程式的要他變成string也沒問題
			String name = rs.getString("cname");
			String tel = rs.getString("tel");
			String birthday = rs.getString("birthday");
			System.out.println( id + ":" + name + ":" + tel +":"+ birthday);
		}
		
		conn.close();
		System.out.println("mysql連線成功");
			//問號帶參數
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
