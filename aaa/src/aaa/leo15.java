package aaa;

public class leo15 {
	public static void main(String[] args) {
	// 擲骰子100次出現的點數 （陣列版本＋灌鉛骰子）
			int[]p = new int[10];
			
			
			for(int i=1;i<=1000;i++) {
				int x = (int)(Math.random()*9+1);  //亂數1-9
				p[x>=7?x-3:x]++;
				// 如果x大於=7 ? 是的話做 : 不是的話做   ＝＝＝三元運算式
				
			}
			
			if(p[0]==0) {
			for( int i=1; i<=6; i++) {
				System.out.printf("%d點出現%d次\n",i,p[i] );
			}
			
			}
			
	
	
	
	}
	}
