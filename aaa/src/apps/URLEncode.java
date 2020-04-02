package apps;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String url = "http://www.gtwang.org/目錄?var1=中文&var2=spa ce";
		
		
		try {
			String encodedURL = URLEncoder.encode(url, "UTF-8");
			System.out.println(encodedURL);
			
		}catch(UnsupportedEncodingException e) {
			System.out.println(e.toString());
		}
	}

}
