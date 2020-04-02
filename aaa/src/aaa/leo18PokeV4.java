package aaa;

import java.util.Arrays;

public class leo18PokeV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// V2版本演化來的
		// 並開始發牌
		
		//時間
//		long now = System.currentTimeMillis();
		
		
		//排有幾張
		int a = 52;
	

	
		
		int[] poker = new int[a];  //0
		for ( int i=0; i<poker.length;  i++  ) poker[i] = i;   // 單行敘述句不用{}  把陣列灌進數字
		
		
		for (int i= poker.length-1;i>0  ;i--) {
			int rand = (int)(Math.random()*(i+1));  //
			int r;
			r = poker[rand] ;
			poker[rand]=poker[i];
			poker[i]=r;
			
		}
		
//		for (int i = 0 ; i<a; i++) {
//			System.out.println(poker[i]);
//		}
//		System.out.println("=====");
//		System.out.println(System.currentTimeMillis()-now);	\
		
		
//		for (int v : poker) {				//for each 
//			System.out.println(v);
//		}
//		
//		System.out.println("=====");
		
		
		//		System.out.println(System.currentTimeMillis()-now);
		
		//發牌開始
		
		int[][] players = new int[4][13];
		for (int i=0 ;i<poker.length;i++) {
			players[i % players.length][i / players.length] = poker[i];
		}
		//定義撲克牌的花色＆數字  數字/13 為花色 數字％13是Ａ～Ｋ
		//用ＡＰＩ做排序
		char[] suit2s = {'\u2660','\u2665','\u2666','\u2663',};  //字元陣列每個元素單引號！！
//		String[] suits = {"黑桃","紅心","方塊","梅花",};
		String[] values = {"A  ","2  ","3  ","4  ","5  ","6  ","7  ","8  ","9  ","10 ","J  ","Q  ","K  "};

		
		
		for (int[] player : players) {
			Arrays.sort(player);       // 按照自然排序法排整的方法
			for (int card : player) {
				System.out.print(suit2s[card/13] +values[card%13]);
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
	}

}
