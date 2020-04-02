package aaa;

public class leo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 陣列 就是物件
		// array => Object
		int[] a ;        //先宣告還沒配置  （直到new才會第一次給值）
		a = new int[3]; //new 給a初始化  int[3]表示陣列裡面有三個元素  一旦給定了之後不能再增加 且陣列內都是同樣單位
	    
		System.out.println(a.length);
		
		int[] b = new int[4];
		for(int i= 0 ; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("=======");
		int[] c = new int[] {1,2,3,4} ; // 這裏陣列內不要再寫4了
		int[] d = {5,6,7,8};			// 如果要直接給值要在宣告的時候就給 不能像範例Ｆ那樣會錯誤
		for (int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
		int[] e;
		e= new int[] {9,8,7,6};
		
//		int[] f;
//		f = {9,8,7,6};					//這樣不行
		
		
		
		
	}

}
