package apps;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;

public class leo37 {

	public static void main(String[] args) {
		
		leo371 obj1 = new leo371();
		try {
			
		obj1.m1(1);
		} catch(Exception e) {
			
		}
		
		
	}

}



class leo371 {
	void m1(int a) throws IOException , Exception{    //這裏可以throws的錯誤可弄最大 但這裡弄什麼 上面的catch就要什麼
		
		if (a == 7 ) {
			throw new IllegalClassFormatException();   //這個例外狀況是比Exception還小 （包含的）所以可以、蛋這裏的不能比throws大
//			throw new RuntimeException();
		}else {
			System.out.println("ok");
		}
		
	}
}