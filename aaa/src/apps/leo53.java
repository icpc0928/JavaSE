package apps;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class leo53 {
//讀寫檔案
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try( DataInputStream din = new DataInputStream(new FileInputStream("dir2/leo.data"))){     //比起52這樣一串也可以
			
			int v1 = din.readInt();
//			double v3 = din.readDouble();     //一定要照寫入時的格式順序去讀取 不然格式會錯亂
			boolean v2 = din.readBoolean();
			double v3 = din.readDouble();
			
			System.out.println(v1 + ":" + v2 + ":" + v3);
			
		}catch(Exception e ) {
			System.out.println(e.toString());
		}

	}

}
