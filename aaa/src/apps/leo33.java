package apps;

public class leo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}


abstract class Poly {
	double calLength() {
		return 1.0;
	}
	abstract double calArea();    //沒定義方法所以抽象
}

class Triangle extends Poly{
	double calArea() {				//來具體定義爸爸的抽象方法
		return 2.0;
	}
}

class Rectangle extends Poly{
	double calArea() {
		return 3.0;
	}
}