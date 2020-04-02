package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class leo46 {

	public static void main(String[] args) {

		File src = new File("dir2/leo.mp3");
		
		File dst = new File("dir1/leo.mp3");    //輸出用

		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream(src);
			
			FileOutputStream fout = new FileOutputStream(dst);
			
			int b ;
			while((b = fin.read()) != -1) {
				fout.write(b);
				
			}
			
			fout.flush();			//輸出沖
			fout.close();			//輸出關
			fin.close();			//輸入關
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
