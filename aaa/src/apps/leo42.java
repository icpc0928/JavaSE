package apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class leo42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout = new FileOutputStream("dir2/file4.txt");
			fout.write(97);
			fout.write(98);
			fout.write(99);
			fout.write(100);         //檔案寫數內容 ascii
			fout.write("hello, world".getBytes());   //把字串轉byte
													//write會把原本資料內容刪掉重寫

			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
