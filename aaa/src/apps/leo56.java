package apps;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//將55的檔案解序列
public class leo56 {

	public static void main(String[] args) {
		try {										//1
			FileInputStream fin =					//2
					new FileInputStream("dir2/s1.score");
			ObjectInputStream oin =
					new ObjectInputStream(fin);
//			if(obj instanceof Student) {			//4 做個實驗這個object骨子裡到底是不是Student
//			System.out.println("SS");
//		}else {
//			System.out.println("XX");
//		}
			
//			Student s = (Student)oin.readObject();	//11.
//			System.out.println(s.getScore());
//			s= (Student)oin.readObject();
//			System.out.println(s.getScore());
//			s= (Student)oin.readObject();
//			System.out.println(s.getScore());
//			s= (Student)oin.readObject();			//12.讀到第四個就會拋出例外（eofException) 所以我們就可以用while回圈來抓
			
			while (true) {							//13.
				try {								//14.
					Student s = (Student)oin.readObject();
					System.out.println(s.getScore());
					
				}catch(EOFException e) {
					break;
				}
			}
			
			
			
//			Object obj = oin.readObject();			//3 只能用object
//			Student s1 = (Student)obj;				//5 將obj物件 強制轉型成student  （前提是本身他谷子裡本來就是了）
//			System.out.println(s1.getScore());
//			System.out.println(s1.getAvg());
			fin.close();
			
		}catch (Exception e ) {
			System.out.println(e.toString());			
		}

	}

}
