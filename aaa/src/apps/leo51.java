package apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

//串接效果 進階 直接串 其實比起50用兩根就夠了
//

public class leo51 {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = 
					new BufferedReader(
							new FileReader("dir2/leo.csv"));
			
			
			
			String line ;
			while ( (line = reader.readLine()) != null) {
			String[] data =	line.split(",");		//把line用,切開做成陣列   這個也可用正規表示法
			System.out.println(data[2]);	      
				
			}
			
			
			
			reader.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
