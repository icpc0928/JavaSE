package apps;

public class leo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//正規表示法 https://docs.oracle.com/javase/7/docs/api/
		//檢查字串內有沒有重複
		
		String a = "145678942";
		if(a.matches("^[0-9]{" + a.length() + "}$")) { 				//matches會用到正規表示法去判斷
			boolean isDup = false;
			
			for(int i = 0 ; i<a.length()-1;i++) {
				char c = a.charAt(i);
				if(a.substring(i+1).indexOf(c) >= 0) {
					isDup = true;
					break;
				}
			}
			System.out.println(isDup?"xx":"OK");
		}
		
		
		
		
	}

}
