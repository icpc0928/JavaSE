package apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//用別人的網頁功能


public class leo65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myurl = "https://www.mobile01.com";
		try {
			URL url = new URL("https://pdfmyurl.com/?url=" + myurl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();				//1
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());  //2
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir2/mobile01.pdf"));
			byte[] buf = new byte[1024*1024];  int len;
			while((len = bin.read(buf)) != -1) {			//3邊讀邊寫1024KB
				bout.write(buf,0,len);
			}
			
			
			bout.flush();
			bout.close();
			bin.close();
			System.out.println("OK");
	
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		

	}

}
