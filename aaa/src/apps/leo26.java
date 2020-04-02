package apps;

import bbb.TWId;

public class leo26 {

	public static void main(String[] args) {
		//玩建構式
		
		TWId id1 = new TWId();						//這就是四種設計方法 我可以都不把 或打布林值要求男女 或打數字要求對應的開頭英文要哪個 或者兩個條件都要
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(4);						//4對應letters的e所以開頭要求是E
		TWId id4 = new TWId(7, true);
		
		
	
		System.out.println(id1.getId() + ":" + (TWId.checkId(id1.getId())?"OK":"XX")  );
		System.out.println(id2.getId() + ":" + (TWId.checkId(id2.getId())?"OK":"XX")  );
		System.out.println(id3.getId() + ":" + (TWId.checkId(id3.getId())?"OK":"XX")  );
		System.out.println(id4.getId() + ":" + (TWId.checkId(id4.getId())?"OK":"XX")  );
		
		TWId id5 = TWId.createTWId("H130161185");
		if (id5 != null) {
			System.out.println(id5.getId());
		} else {
			System.out.println("null");
		}
		
		
	}

}
