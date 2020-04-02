package apps;

import javax.swing.JOptionPane;

public class leo24 {

	public static void main(String[] args) {
		// 1a2b遊戲
		int len = 3;       // 想猜幾碼
		
		leo24 obj = new leo24();
		String answer = obj.createAnswer(len);  //傳遞參數
		System.out.println(answer);
		
		boolean isWinner = false;
		StringBuffer log = new StringBuffer();
		for(int i=1 ;i <= 10 ;i++) {
		String guess = JOptionPane.showInputDialog((i)+" 輸入數字\n" + log.toString());
		
		if (! obj.checkGuess(guess,len)) continue;
		
		
		String result = obj.checkAB(answer, guess);
		log.append(guess + " => " + result + "\n");
		JOptionPane.showMessageDialog(null, result);
		if (result.equals(len+ "A0B")) {        //如果全對的話
			isWinner = true ;
			break;
		}
		}
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "You Win");
		} else {
			JOptionPane.showMessageDialog(null, "You Lose" + answer);
		}	
	}
	
	
	boolean checkGuess(String g , int len) {        //true = good          //檢查輸入是否為數字且長度吻合且不重複
		boolean ret = false;				//
		if(g.matches("^[0-9]{" + len + "}$")) {   //這裡有符合只代表長度ＯＫ且是數字
			boolean isDup = false;						// false = good
			for(int i = 0 ; i<g.length()-1;i++) {
				char c = g.charAt(i);
				if(g.substring(i+1).indexOf(c) >= 0) {   // indexOf()有重複會大於零
					isDup = true;
					break;
					
				}
			}
			ret = !isDup;
		}else {
			ret = false;
		}
		return ret;
	}
	
	String checkAB(String a,String g) {
		int A , B; A = B = 0;
		for(int i = 0 ; i<a.length(); i++) {
			if(a.charAt(i)==g.charAt(i)) {				//a中第i碼 有沒有跟 g中第i碼吻合
				A++;
			} else if(a.indexOf(g.charAt(i)) != -1){   //g中第i碼有沒有存在於a中
				B++;
				
			}
		}
		
		return A + "A" + B + "B";
	}
	
	String createAnswer(int d) {
		int[] poker = new int[10];  //0
		for ( byte i=0; i<poker.length;  i++  ) poker[i] = i;   
		for (int i= poker.length-1;i>0  ;i--) {
			int rand = (int)(Math.random()*(i+1));  //
			int r;
			r = poker[rand] ;
			poker[rand]=poker[i];
			poker[i]=r;
		}
		
		StringBuffer sb= new StringBuffer() ;   // string | stringBuffer |stringBulider
		for(int i = 1; i<=d ;i++) {
			sb.append(poker[i]);    //StringBuffer.append 從後面增加
		}
		return sb.toString() ;
	}

}
