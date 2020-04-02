package apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class leo59 {
//sending only 還沒寫到接收 所以接收端收不到 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesg = "bye";			//3
		byte[] send = mesg.getBytes();  //3.我要送的資料在這邊
		try {
			DatagramSocket socket = new DatagramSocket();  //1 建立socket物件 用來發送跟接收封包 不傳參數是因為做發送的作用
			DatagramPacket packet = new DatagramPacket(		//2.封包物件 封包會有來源目的地 （來源是自己,目前沒得改） 
					send, send.length,   					//4.發送的風包跟大小
					InetAddress.getByName("10.0.103.93") , 8888   );		//5.地址
			socket.send(packet);				//6.發送
			socket.close();//7.
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
			
		}
		
		
		
	}

}
