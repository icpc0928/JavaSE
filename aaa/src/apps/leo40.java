package apps;

import java.io.File;

public class leo40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File approot = new File(".");  				//這個點是你目前執行專案的目前路徑點
		System.out.println(approot.getAbsolutePath());  
		File dir1 = new File("./dir1");				//  ./現在這底下的dir1
		System.out.println(dir1.exists());
		File dir2 = new File("dir2");				//一樣的意思現在這裏的dir2
		if(!dir2.exists()) {
			dir2.mkdir();							//創造一個資料夾出來
		}
		File dir1234 = new File("dir1/dir2/dir3/dir4");
		if(!dir1234.exists()) {
			dir1234.mkdirs();     					//爸爸不再幫我創爸爸 （沒有父目錄 幫我創出來）
		}
		
		
		
	}

}
