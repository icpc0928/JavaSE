package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
// 讀取file3的內容   V3版本
public class leo44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("dir2/file3.txt");
			FileInputStream fin = new FileInputStream(file);
			
			byte[] buf = new byte[(int)file.length()];    //file.length原本是long 強制轉黨成int （陣列內規定是int)  
			fin.read(buf);
			
			
			
			
			System.out.print(new String(buf));		
			
		
			
			
			fin.close();
			
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
