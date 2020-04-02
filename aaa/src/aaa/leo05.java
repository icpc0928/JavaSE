package aaa;

public class leo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;     //總共要印幾段（一段有col個
		int how = 10;	//每個表要印出乘上幾個數字
		int start = 1;	//從哪個數字開始
		int col = 5;	//每段要排幾個
		
		
		for( int k = 0; k < row ; k++){
			for (int j=1 ; j<= how ; j++ ){
			for (int i=start; i< start+col; i++){

			    int x = i + (k*col);
			    int r = x * j;
			    
			    System.out.printf("%d x %d = %d \t",x,j,r);
			}  
			System.out.println();
			}
			System.out.println("==========================================================");


			}
		
		
	}

}
