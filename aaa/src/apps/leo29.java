package apps;


public class leo29 {
	//java的多型

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leo291 obj1 = new leo291();
		leo292 obj2 = new leo292();
		
		doSomething(obj2);
	}
	static void doSomething(Javaer javaer) {
		javaer.OCAJP();
	}

}
interface Javaer {      //interface是定義＿＿＿＿的“規格”    //規格百分百要供人實作所以一定是public 沒寫出來就預設是public
	void OCAJP();
	void OCPJP();
}

class leo291 implements Javaer{     //implements叫做實作   //這段的意思僅僅是宣告
	public void OCAJP() {System.out.println("a");}				//因為是用interface的規格 需要符合他用的規格 所以一定也要用public
	public void OCPJP() {}
}

class leo292 implements Javaer{     
	public void OCAJP() {System.out.println("b");}				//!!少一個方法都不行 人家規格寫兩個這裡就是兩個
	public void OCPJP() {}
}