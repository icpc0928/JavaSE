package apps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class leo41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir2 = new File("dir2");
		File[] files = dir2.listFiles();
		for (File file : files) {
			
			
			Calendar cal = Calendar.getInstance();         //基本的時間處理
//			cal.setTime(new Date(file.lastModified()));
			cal.setTimeInMillis(file.lastModified());      //這兩種方法都行
			
			
			System.out.println(file.getName() + ":" + 
			file.length() + ":" + cal.get(Calendar.YEAR)+"-"+
			(cal.get(Calendar.MONTH)+1)+"-"+
			cal.get(Calendar.DAY_OF_MONTH));
			
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date current = new Date(file.lastModified());
			
			System.out.println(file.getName() + ":" + 
					file.length() + ":" + sdf.format(current));
		}
	}

}
