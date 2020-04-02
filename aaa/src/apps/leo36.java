package apps;

public class leo36 {
//try catch 有捕捉到拋出例外的話 、會讓他繼續走  （原本的拋出例外下面的就不會走了、這個讓他可以繼續往下走）
	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = { 1, 2, 3, 4, 5, };
		System.out.println("start");
		try {
			System.out.println(c[3]);
			System.out.println(a / b);
			
		} catch (ArithmeticException e) {				//ArithmeticExc 數學例外 is a RuntimeExc
			System.out.println("Mathbbb");
		} catch (RuntimeException e) {					 // 只要是執行階段拋出來的 一定是runtimeException內的
			System.out.println("aaaa");
		}
		System.out.println("end");

	}

}
