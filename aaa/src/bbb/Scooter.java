package bbb;

//所有類別一定會有建構式、如果沒寫一定會找爸爸內的無傳參數的建構式拿來當作唯一的建構式  （重要重要）如果沒寫就是java.lang.object內有的建構式（constructor and description) object() 裡面空無一物
// 建構式一定要與類別名稱一模一樣
//	如果類別中有了建構式、就不用找爸爸的了  
import aaa.Bike;


public class Scooter extends Bike {     //大括號前面的東西叫做對外宣告  我將要來定義這件事  括號裡面才是方法
	
	
	private int gear;
	
	public Scooter() {
		// super();       //其實會偷偷先跑這個敘述句 先抓爸爸的無傳參數（所有物件在、祖宗八代都會在、java會偷偷做）
		super(4);			//也可以指定抓爸爸的有傳參數建構式 如果是這樣就不會跑上面那個super
		System.out.println("scooter()");
	}
	
	
	public void upSpeed() {         
		super.upSpeed();  //叫父類別的物件實體 用 super  //先把爸爸的做完在做下面的
		speed *= 1.2;
	}
	
	public void upSpeed(int gear) {
		setGear(gear);
		speed = speed <1 ? 1: speed*1.2*gear;
	}
	
	private void setGear(int newgear) {	
//      gear      //這裡的gear是靠近的gear
		this.gear = newgear;   //用this指向物件
	}
	
	
}
