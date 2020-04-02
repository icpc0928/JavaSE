package apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


//頁面原始碼


public class leo63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://bradchao.com/wp");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		

	}

}
