package apps;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class leo49 {
//真正讀取文件的東西   //一次讀取一個char 就不用擔心有亂碼的問題 所以reader writer  適合讀寫文字
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader reader = new FileReader("dir2/file3.txt");
			int c ;
			while( (c = reader.read()) != -1) {
				System.out.println((char)c);
			}
		} catch (Exception e) {
		System.out.println(e.toString());
		}
		
		
		
	}

}
