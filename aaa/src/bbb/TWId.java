package bbb;        // 身分證產生器 再leo26可測    挑戰題：中國身份證 統編;....

public class TWId {       

	private String id ;  											//我的身份證物件 不想讓人亂來所以用private
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO"; 	 //indexOf(c0)+10;    //用static 才能讓其他物件使用
	
	public TWId() {    						 //我的建構式				//!!為什麼要那麼多方法、是我自己可以設計的、但多個方法最後都會在下面動作、所以好維護
		this((int)(Math.random()*2)==0);    //呼叫第2個TWId    				// java內布林值只能顯示true false 型別只有t f 沒有01 但是儲存只有1bit
	}
	
	public TWId(boolean isMale) {   //我可能會對外提供的哪些方法 ===是男是女 		//建構式沒有任何繼承關係 只是第一次初始化會呼叫
		this((int)(Math.random()*26),(int)(Math.random()*2)==0);     //呼叫第四個twid
	}
	
	public TWId(int area) {											//我可能會對外提供的哪些方法
		this(area, (int)(Math.random()*2)==0);      				// 呼叫第四個ＴＷＩD
	}
	
	public TWId(int area, boolean isMale) {   						//依照相應條件亂數給出身分證字號的建構式
		StringBuffer sb = new StringBuffer(letters.substring(area, area+1));
		sb.append(isMale?"1":"2");    								 //搞定男生女生;
		for(int i = 0 ;i <7 ; i++) {								//將除了第一個數字外的前七碼設定亂數
			sb.append((int)(Math.random()*10));
		}
		String first9 = sb.toString();      		//先把sb的放在first9             //  toString 可以override 改成自己要用的 不然預設就是記憶體位置（toString就是拿來玩的
		for(int i=0 ; i<10 ;i ++) {					//跑回圈校驗第十碼可以的話就放進去
			if (checkId(first9 + i)) {
				id = first9 + i ;					//也可以用contant
				break;
			}
		}
		
		
		
	}
	private TWId(String id) {       //怕對外提供會做出不合理的物件出來  只有經過我肚子裡面的邏輯運算後我才能叫他 所以private先 （內部呼叫用的） 存粹提供給下面的twid玩
		this.id = id;
	}
	public static  TWId createTWId(String id) {	// 如果直接打身分證也可以 
		TWId temp = null;
		if (checkId(id)) {
			temp = new TWId(id);			//new完就有物件實體了
		}
		return temp;
	}
	
	public static  boolean checkId(String id) {  //如果掛static就是與物件完全無關 就像寫function 但是是獨立的     //目的 檢查過後才能給物件實體
		boolean ret = false;
	
		
		if (id.matches("[A-Z][12][0-9]{8}")) {      //字串就是完全符合就不用＾＄     正規表示法練習 ip email驗證
			char c0 = id.charAt(0);  					   //Y = 3 1
		    int n12 = letters.indexOf(c0)+10;            //抓取letters的第幾個+10
		    int n1 = n12 / 10;
		    int n2 = n12 % 10;
		    int n3  = Integer.parseInt(id.substring(1,2));
		    int n4  = Integer.parseInt(id.substring(2,3));
		    int n5  = Integer.parseInt(id.substring(3,4));
		    int n6  = Integer.parseInt(id.substring(4,5));
		    int n7  = Integer.parseInt(id.substring(5,6));
		    int n8  = Integer.parseInt(id.substring(6,7));
		    int n9  = Integer.parseInt(id.substring(7,8));
		    int n10 = Integer.parseInt(id.substring(8,9));
		    int n11 = Integer.parseInt(id.substring(9,10));
		    int sum = n1 *1 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7*4 + n8*3 + n9*2 +n10*1 +n11*1;
		    
		    ret = sum % 10 == 0;     // 如果ret mod 10 有等於0 那就是true;
		    
		}		
		return ret;
	}
	
	public String getId() {						//最終可以讓你return你的id (純粹做return的事情）
		return id;
	}
	
	
	
	
}
