package apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class leo60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] buf = new byte[1024];
		
		
		
		try {
			DatagramSocket socket = new DatagramSocket(8888);					//1.socket要先建立出來  且接收端要指定port號
			DatagramPacket packet = new DatagramPacket(buf, buf.length);		//2.準備一個空的信箱 （buf 且容量是 buf.length） 
			
			socket.receive(packet);					//3.信箱準備好接收receive封包
			socket.close();							//4.
			
			InetAddress urip = packet.getAddress();	//5.取得誰寄來的
			byte[] data =packet.getData();			//6.內容物
			int len = packet.getLength();			//7.內容物大小
			String mesg = new String(data,0,len);	//8.轉乘string
			System.out.println("receive OK " + urip.getHostAddress()+":"+ mesg);
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
