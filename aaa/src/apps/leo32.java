package apps;

public class leo32 {

	public static void main(String[] args) {
		//總結  抽象類別的小孩需要幫老北把抽象的方法完善
		//抽象類別一定要有子類別來表現抽象類別多型的特徵
		
//		leo321 obj1 = new leo321();     //4.因為leo321是抽象類別 不能產生實體物件 所以leo321變紅字
		leo321 obj1 = new leo322();     //7.這樣就可以惹
		leo321 obj2 = new leo323();
		obj1.m3();
		obj2.m3();						
		
		

	}

}



abstract class leo321{      //3.所以我也要變成抽象類別
	void m1() {}
	void m2() {}
    abstract	void m3();    	//1.沒有大括號就是沒定義方法 可能我不想在這裡規定死這個方法,但是要有 //2.所以用abstract 當作是抽象的void
}

class leo322 extends leo321{	//5.認了一個不清不出的老爸也不行
	void m3() {System.out.println("leo322:m3");}				//6. 有大括號就有實作 所以這樣就又可以了
	
}

class leo323 extends leo321{
	void m3() {System.out.println("leo323:m3");	}
}