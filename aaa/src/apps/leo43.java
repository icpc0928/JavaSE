package apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// 讀取file3的內容   目前這兩招不能讀取中文
public class leo43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("dir2/file3.txt");
			
			int c ;									//第一招 //比較推
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);			//每次讀取read的時候都會往下一個跑 （ＡＰＩ裡有寫）
			}
			
			while(fin.available() > 0 ) {			//第二招   
				System.out.print((char)fin.read());
			}
			
			
			
			int a  = fin.read();
			System.out.println((char)a);
			
			fin.close();
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
