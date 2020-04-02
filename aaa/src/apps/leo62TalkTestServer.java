package apps;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class leo62TalkTestServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		try {
//			ExecutorService executorService = Executors.newFixedThreadPool(100);//最多容納100個客戶端聊天
//			ServerSocket serverSocket = new ServerSocket(6655);//監聽6655號埠
//			for (int i = 0; i < 100; i ++ ) {
//			Socket client = serverSocket.accept();
//			System.out.println("有新的使用者連線 "   client.getInetAddress()  ;
//			client.getPort());
//			executorService.execute(new ExecuteClientThread(client));
//			}
//			executorService.shutdown();
//			serverSocket.close();
//			} catch (Exception e) {
//			e.printStackTrace();
//			}
		try {
			ExecutorService exceutorService = Executors.newFixedThreadPool(100);
			ServerSocket serverSocket = new ServerSocket(6655);//監聽6655號埠
			for(int i=0 ; i<100; i++) {
				Socket client = serverSocket.accept();
				System.out.println("有新的使用者連線 " +  
				client.getInetAddress()  + 
				client.getPort());
				ExecutorService.execute(new ExecuteClientThread(client));
			}
			ExecutorService.shutdown();
			serverSocket.close();
			
			
		}catch (Exception e ) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
