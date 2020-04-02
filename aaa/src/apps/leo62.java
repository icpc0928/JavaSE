package apps;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
// tcp 這是server端
public class leo62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(7788);					//1.先建立socket  這只是物件還沒屁用
			Socket socket = server.accept();           						//2.開始等候  這時socket才開始有用 等候時程式碼會停留在這裡等待 直到接收到or time out
			InputStream in = socket.getInputStream();						//3.一聽到有人要連線我 我就做inputstream的管路接收
			
			InetAddress urip = socket.getInetAddress();
			System.out.println(urip.getHostAddress());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));		//4.用reader/writer 去讀取我要的文字 （用bufferedreader 這根管子去承接inputStream)
			String line;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
			
			
			
			in.close();
			server.close();
			System.out.println("server OK ");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
