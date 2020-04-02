package aaa;

public class leo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 擲骰子100次出現的點數 （無陣列版本）
		int a ,b,c,d,e,f,g ;
		a =b=c=d=e=f=g=0;
		
		
		for(int i=1;i<=100;i++) {
			int x = (int)(Math.random()*6+1);  //亂數1-6
			

			switch(x) {
			case 1: a++; break;
			case 2: b++; break;
			case 3: c++; break;
			case 4: d++; break;
			case 5: e++; break;
			case 6: f++; break;
			default: g++;
			}
		}
		
		if(g==0) {
		
		System.out.printf("1點 = %d 次 ",a);
		System.out.println();
		System.out.printf("2點 = %d 次 ",b);
		System.out.println();
		System.out.printf("3點 = %d 次 ",c);
		System.out.println();
		System.out.printf("4點 = %d 次 ",d);
		System.out.println();
		System.out.printf("5點 = %d 次 ",e);
		System.out.println();
		System.out.printf("6點 = %d 次 ",f);
	}
		
	}

}
