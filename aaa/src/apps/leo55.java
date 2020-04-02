package apps;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//io

public class leo55 {

	public static void main(String[] args) {  
		Student s1 = new Student(70,60,30);		//3.
		Student s2 = new Student(90,10,30);
		Student s3 = new Student(40,60,20);
		
		
//		System.out.println(s1.getAvg());
		try {								//1.
			FileOutputStream fout = 		//4.
						new FileOutputStream("dir2/s1.score");
			ObjectOutputStream oout =		//5.
					new ObjectOutputStream(fout);   
			oout.writeObject(s1); 			//6.把學生透過物件的方式真正寫出去
			oout.writeObject(s2); 
			oout.writeObject(s3); 
			fout.flush();
			fout.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}


class Student implements Serializable{				//要被io的物件     //2.   //7.把student實作可序列化Seri....
	private int ch;									//物件的重點在屬性 我要有屬性才能操作下面的加總跟平均（所以加總平均是方法人人都有 但學生的屬性幾分才重要）
//	transient private int eng;						//做完56之後回來看這裡 如果把屬性加上 transient  關鍵字 就不會讓這個屬性被序列化
	private int eng;
	private int math;				
	Student(int ch, int eng , int math){
		this.ch=ch ; this.eng=eng; this.math=math;
	}
	int getScore() {return ch+ eng + math;	}
	double getAvg() {return getScore()/3.0;}
}