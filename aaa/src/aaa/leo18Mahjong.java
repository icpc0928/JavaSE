package aaa;

import java.util.Arrays;

public class leo18Mahjong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//有幾張牌 有花144 無花136
		int a = 12;
		//一人拿幾張牌 有16張 13張
		int b = 3;
		
		int [] ma = new int [a];
		for (int i=0 ; i<ma.length ; i++) ma[i]=i;  //給定ma內所有的值
		
		for(int i= ma.length-1;i>0;i--) {           //洗牌
			
			int rand =(int)(Math.random()*(i+1));
			int randTemp ;
			randTemp = ma[rand];
			ma[rand] = ma[i];
			ma[i] = randTemp;	
		}
		
//		for(int i=0;i<ma.length;i++) {
//			System.out.println(ma[i]);
//		}
		
		int [][] players = new int [4][b];
		for (int i=0 ;i<ma.length;i++) {
//			players[i % players.length][i / players.length] = ma[i];  //發牌 一次一人拿一張
			
			
		}
		
		
		String[] suits = {"萬","筒","條","大字",};
		String[] values = {"一","二","三","四","五","六","七","八","九",};


		for (int[] player : players) {
			Arrays.sort(player);       // 按照自然排序法排整的方法
			for (int card : player) {
				System.out.print(values[(card/4)%9]+suits[card/36]);
			}
			System.out.println();
		}
		
		
		
		
	}
}
