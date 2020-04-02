 package aaa;
// 物件導向
public class Bike extends Object {   //沒講繼承誰就一定是繼承於 Object  (java.lang.Object)  // 試著把public刪掉看bbb的scotter內的bike

	protected double speed ;  //宣告為private 只存活在bike的括號裡面  存取修飾字 
	protected int color;   // 0: no color
	public Bike() {
		//super(); 
		System.out.println("bike()");
		this.color = 1;
	}
	
	//建構式沒有傳回值的型別、只做初始化、名稱要跟類別名稱一模一樣
	public Bike(int color) {
		System.out.println("bike(int)");
		if(color>0) this.color=color;
		else this.color = 1;    // 先讓color 初始化的時候有顏色
	}
	public void setColor(int color) {
		if(color>0) {
			this.color = color;
		}
	}
	public int getColor(){
		return color;
	}
	
	public void upSpeed() {
		speed = speed < 1 ? 1: speed*1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	
	
}
