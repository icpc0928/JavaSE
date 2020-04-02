package aaa;

public class leo20homework {

	public static void main(String[] args) {
		// 質數表 每十個一列

		int x = 0 ;
		int y = 0 ;   //總共有幾個質數
		int line = 10; //每line個印一列 
		int n = 65535;  //1-n有多少質數會列印出來
		long now = System.currentTimeMillis();
		
		for (int i = 1 ; i<= n; i++) {
			for (int j = 1 ; j <= i/2 ;j++) {
				if (i % j == 0) {
					x ++ ;
				}
			}
			if( x == 1) {
				System.out.print(" "+i);
				x = 0 ;
				y ++;
				if ( y % line == 0) {
					System.out.println("");
				}
			} else x = 0;
			
		}
		
		System.out.printf("\n"+"1 - %d"+" 總共有 " + "%d" +" 個質數",n,y);
		
		System.out.println("\n=====");
		System.out.print(System.currentTimeMillis()-now);
	}
}
