package apps;

public class leo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leo311 obj1 = new leo311();    //假設是一台車
		leo312 obj2 = new leo312();		//假設是法拉利
		obj1.m1();
		obj2.m1();
		leo311 obj3 = new leo312();   //我用311宣告 但是是用312的方法  所以能夠有311的m1方法 但是跑312 。卻不能有m2方法因為是用311來宣告的  //好比我要一台車 你給我法拉利（也是車）
		obj3.m1();
//		obj3.m2();  這個就找不到了  因為我宣告的時候沒有這個功能
		
		((leo312)obj3).m2();    	//強制轉型到312的方法
		
//		leo312 obj4 = new leo311();   這樣就不能  我要一台法拉利 你給我一台“車”會接受媽？
//		((leo312)obj1).m2();       //直系血親基本讓可以轉、編譯會過 .但是會在執行階段拋出例外
		System.out.println("======");
		test1(obj3);
		System.out.println("======");
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
		System.out.println("======");
		String s1 = "Brad";
//				if(s1 instanceof leo311) {			不是直系血親 編譯失敗
//				}
		

	}
	static void test1(leo311 objx) {
		objx.m1();
		
//		objx.getClass();   //反射類別 以後教
		
		if(objx instanceof leo312) {   //objx是不是312的物件實體
			((leo312)objx).m2();		//做轉型
		}
		
	}
	

}

class leo311{
	int a = 10;
	void m1() {System.out.println("leo311:m1()" + a);}
}

class leo312 extends leo311{
	int a = 20;
	//override
	void m1() {System.out.println("leo312:m1()" + a + ":"+ super.a);}   // a 就是this.a
	void m2() {System.out.println("leo312:m2()" );}
	
	
}