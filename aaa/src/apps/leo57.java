package apps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//序列化跟解序列化同時進行
public class leo57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leo573 obj = new leo573();
		
		try {
			ObjectOutputStream oout =
					new ObjectOutputStream(new FileOutputStream("dir2/leo.object"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("Save OK");
		}catch (Exception e){
			System.out.println(e.toString());
		}
		System.out.println("=======================");
		try {										//4.解序列化
			ObjectInputStream oin =
					new ObjectInputStream(new FileInputStream("dir2/leo.object"));
			Object obj2 = oin.readObject();
			oin.close();
			System.out.println("read OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
class leo571 {					//3.只要有其中一代做序列化（serializable)就ＯＫ
	leo571(){System.out.println("leo571()");}
}
class leo572 extends leo571 {  //5.解序列化要看在哪一代有解、如在爸爸這代只需要叫阿公就行
	leo572(){System.out.println("leo572()");}
}
class leo573 extends leo572 implements Serializable{
	leo leo;      			//6. has a 擁有的觀念試試看 （就卡關惹） //7.屬性也得要可序列化
	leo573(){System.out.println("leo573()");
	leo = new leo();
	}
}

class leo implements Serializable{					//7.一個擁有的（has a )屬性也要可序列化
	leo(){System.out.println("leo()");}
}
