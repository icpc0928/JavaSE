package bbb;

public class leospec2 {     						//public 類別一定要跟檔名一樣

	public static void main(String[] args) {
//		leo22 obj1 = new leo22();
//		System.out.println(obj1.a);
//		
//		leo21.m1();
//		leo21.m1();
//		leo21.m1();
//		
//		leo21 obj1 = new leo21();
//		leo21 obj2 = new leo21();
//		leo21 obj3 = new leo21();			//21的static只會載入第一次
		
//		leo22.m2();							//21(爸爸的）static會先做
		leo22 obj1 = new leo22();
		
		
		

	}

}


class leo21{										//所以第二個以上的類別就不能用public   也可以一個檔名沒有public但這樣就只能在相同package內使用
	int a = 12;
	public leo21() {								//這裡寫public其實是無聊 因為外層的class已經不是public了
		System.out.println("leo21()");
	}
	
	{
		System.out.println("{} a = " + a );
	}
	static {
		System.out.println("static.leo21{}");   	//匿名static 只會在第一次載入
	}
	static void m1() {
		System.out.println("static leo21 m1()");
	}
}

class leo22 extends leo21{
	leo22(){
		System.out.println("leo22()");
	}
	{
		System.out.println("leo22.{}");          	//第二層類別的空{}
	}
	
	static {
		System.out.println("static.leo22{}");   	//匿名static 只會在第一次載入
	}
	
	static void m2() {
		System.out.println("static leo22 m2()");
	}
}
