package apps;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class leo52 {

	public static void main(String[] args) {
		//自動關閉機制
		
		try(FileOutputStream fout = 
				new FileOutputStream("dir2/leo.data");      //一道敘述句可用分號隔開  這段就代表可以自動close and flush
				DataOutputStream dout = 
					new DataOutputStream(fout)
				){
			dout.writeInt(123);
			dout.writeBoolean(true);
			dout.writeDouble(12.3);
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
