package aaa;

public class leo18PokeV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		long now = System.currentTimeMillis();
		//洗牌
		int[] poker = new int[52];  //0
//		for ( int i=0; i<poker.length;  i++  ) poker[i] = i;   // 單行敘述句不用{}  把陣列灌進數字
		// V1版本延伸出來 比較不噁心的方式
		
		
		for (int i=0; i<poker.length;  i++  ) {
			boolean isRepeat;
			int rand;
			do {
				rand = (int)(Math.random()*52);   //0~51
				//檢察機制
				isRepeat = false;
				for (int j=0; j<i;j++) {
					if (rand == poker[j]) {
						//重複的話
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			poker[i] = rand;
			System.out.println(poker[i]);
			
	

		}
		
		System.out.println("=====");
	System.out.println(System.currentTimeMillis()-now);

		
		
		
		
	}

}
