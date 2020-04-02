package apps;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//tcp 協定 有連成功才傳資料（先做好三方交握才會傳資料）  這是client端
public class leo61 {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.103.93"), 7777);   //1.一樣先透過socket才能出門 目的地跟port都需要  這道敘述句講完就會嘗試做三方交握（如果沒有拋出例外就表示連線成功）
						
			OutputStream out = socket.getOutputStream();  //2.由socket 做輸出串流的管子

			out.write("(ꐦ ಠ皿ಠ )".getBytes());					//3.把資料write 

			out.flush();
			out.close();
			socket.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
