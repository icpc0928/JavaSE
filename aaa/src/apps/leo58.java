package apps;

import java.net.InetAddress;

public class leo58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress ip = InetAddress.getByName("127.0.0.1");	  //不要寫http那叫做url
			System.out.println(ip.getHostAddress());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
