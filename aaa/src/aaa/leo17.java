package aaa;

public class leo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		
		int [][] a ;
		a = new int [2][3];
//		System.out.println(a[0][1]);
//		System.out.println(a.length);
		//System.out.println(a[0].length);
		
		//尋訪陣列內容
		for(int j=0 ; j<a.length ; j++) {
		for (int i=0; i<a[j].length;i++) {
			System.out.print(a[j][i] + "  ");
		}
		System.out.println();
		}
		System.out.println("-------");
		
		
		int[][] b = new int [2][];
		b[0]=new int[3];
		b[1]=new int[4];
//		System.out.println(b.length);
//		System.out.println(b[0].length);
//		System.out.println(b[1].length);
		
		
//		尋訪陣列內容（全部）
		for(int j=0 ; j<b.length ; j++) {
			for (int i=0; i<b[j].length;i++) {
				System.out.print(b[j][i] + "  ");
			}
			System.out.println();
			}
			System.out.println("-------");
			
			//尋訪陣列內容 （使用for each)
			
			for (int [] sub : b) {				// for (int[] sub (被尋訪到的就是sub): b (我要尋訪誰））
				for(int v : sub) {				
				System.out.print(v + "   ");
			}
				System.out.println();
			}

		
		
		
		
		
		
		
	}

}
