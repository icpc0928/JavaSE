package apps;

public class leo34 {

	public static void main(String[] args) {
		//介面interface就是要供人實作  介面本人就是規格 不會有實作
		
//		leo341 obj1 = new leo341(); //341是介面不是類別所以不能這樣做
		leo341 obj1 = new leo344(); 
		leo341 obj2 = new leo345();
		leo344 obj3 = new leo344();
		System.out.println(obj3 instanceof leo344);
		System.out.println(obj3 instanceof leo341);       //instanceof = is a // so obj3 就是341的物件實體
	}

}


interface leo341{
	void m1();
	void m2();
	
}

interface leo342{
	void m2();
	void m3();
	
}

interface leo343 extends leo341, leo342{      
	//我可以把多個規格納在一起  重要這裏的extends不像是繼承  用發揚光大的角度去看   class的extends只能一個 ,規格可以extends很多個
	void m4();
}

class leo344 implements leo341,leo342{       //1類別也能實作implements 多個介面  就不是extends發揚光大  
	public void m1() {}						//2那就要幫他實作好方法
	public void m2() {}
	public void m3() {}
	
}

class leo345 implements leo343{
	public void m1() {}						
	public void m2() {}
	public void m3() {}
	public void m4() {}
}

abstract class leo346{      	//抽象類別裡面也可以不要有抽象方法  擺明就是沒有要用物件實體（我只是對外宣稱我抽象.我沒有要做出物件實體,你去找我的子類別
	void m1() {}
}



