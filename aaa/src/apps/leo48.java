package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//複製檔案v3 限制只能讀2G    一次性讀取 再一次性寫入

public class leo48 {

	public static void main(String[] args) {

		File src = new File("dir2/leo.mp3");
		
		File dst = new File("dir1/leo.mp3");    //輸出用

		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream(src);     //先做輸入串流
			byte[] buf = new byte[(int)src.length()];			
			fin.read(buf);										//把所有取出來的陣列數塞到fin.read
			fin.close();
			
			
			FileOutputStream fout = new FileOutputStream(dst);		//在做輸出串流
			fout.write(buf);										//再一次性將buf做輸出
			fout.flush();
			fout.close();
			
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
