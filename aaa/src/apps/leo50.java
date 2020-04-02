package apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//串接效果 這裏串三根

public class leo50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("dir2/leo.csv");
			InputStreamReader irs = new InputStreamReader(fin);  //管子塞進去
			BufferedReader reader = new BufferedReader(irs);
			
			String line ;
			while ( (line = reader.readLine()) != null) {
			String[] data =	line.split(",");		//把line用,切開做成陣列
			System.out.println(data[1]);	      
				
			}
			
			
			
			fin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
