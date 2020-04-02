package aaa;

public class leo20homeworkv2 {

	public static void main(String[] args) {
		// 列出1-x的數值中 其質因數只能有2或3或5 的數 最後再加總  （這是ptt上java板有人問的題目）

		int x = 65535;  // 給定的值
		int sum = 0;
		
		
		for (int i = 2; i<= x; i++) {
		
			int n = i ;
		while (n % 2 == 0) n = n / 2 ;
		while (n % 3 == 0) n = n / 3 ;
		while (n % 5 == 0) n = n / 5 ;
		
		if(n == 1) {
			sum += i ;
		System.out.println(i);
		}
		}
		
		System.out.println(sum);
		
		
				

				
				
			
		
		
		
		
		
		
	}

}
