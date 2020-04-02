package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//複製檔案v2
public class leo47 {

	public static void main(String[] args) {

		File src = new File("dir2/leo.mp3");
		
		File dst = new File("dir1/leo.mp3");    //輸出用

		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream(src);
			
			FileOutputStream fout = new FileOutputStream(dst);
			
			int len ; byte[] buf = new byte[4096*1024];           //陣列內一次讀取 目前是4MB
			while((len = fin.read(buf)) != -1) {
				fout.write(buf,0,len);   		//從零開始之後讀多少（避免最後一次長度不等於我們陣列內的大小
				
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
