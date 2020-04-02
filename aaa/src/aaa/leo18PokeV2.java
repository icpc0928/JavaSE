package aaa;

public class leo18PokeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long now = System.currentTimeMillis();
		//洗牌
		int a = 20;
		//洗牌次數
		int how = 10000;
		
		int[] poker = new int[a];  //0
		for ( int i=0; i<poker.length;  i++  ) poker[i] = i;   // 單行敘述句不用{}  把陣列灌進數字
		
		
		for (int i=0;i<=how;i++) {
			int rand = (int)(Math.random()*a);
			int rand2 = (int)(Math.random()*a);
			int r;
			r = poker[rand] ;
			poker[rand]=poker[rand2];
			poker[rand2]=r;
			
		}
		
		for (int i = 0 ; i<a; i++) {
			System.out.println(poker[i]);
		}
		System.out.println("=====");
		System.out.println(System.currentTimeMillis()-now);

		
		
		
		
		
		
		
		
		
		
		
	}

}
