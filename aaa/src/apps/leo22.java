package apps;

import aaa.Bike;
import bbb.Scooter;


public class leo22 {

	public static void main(String[] args) {
		Bike b1 = new Bike(4);             //這串就是到bike.java內找建構式 但是會找到有回傳參數的建構式 so color =4
		System.out.println(b1.getColor());
		b1.setColor(2);						//再用鐵樂士油漆成2號
		System.out.println(b1.getColor());
		System.out.println("==========");
		
		
		
		Scooter s1 = new Scooter();
		System.out.println(s1.getColor());
		
		
		
		
		
		
	}

}
