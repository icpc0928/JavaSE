package apps;

import bbb.leo;

public class leo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = new String("Leo");  // Java中字串就是物件哦
//		leo b1 = new leo();        // ctrl + shift + O 會自動import
//		System.out.println(s1);    // 最原生的呼叫會呼叫出toString();
//		System.out.println(b1);		//同上 而object的toString()會顯示存放記憶體的位置
		
		String s1 = new String();
		byte[] b1 = {97,98,99,100,101,102,103,};
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);     // 可以用ˋ陣列 印出字串
		String s3 = new String(b1,2,4);
		System.out.println(s3);
		System.out.println("=======");
		
		String a1 = new String(b1);   //"abcdefg"
		String a2 = new String(b1);
		System.out.println(a1 == a2);  // 基本型別放“值” 物件型別放記憶體位址
		System.out.println( a1.equals(a2) );  // 字串的equals用來比對字串內容  把a1內的內容做比較
		
		System.out.println("-------");
		leo leo1 = new leo();
		leo leo2 = new leo();
		System.out.println(leo1 == leo2);
		System.out.println(leo1.equals(leo2));
		System.out.println("-------");
		
		String a3 = "abcdefg";  //雙引號就是物件所以這個字串也會有記憶體位置
		String a4 = "abcdefg";  //會在一個string pool 裡面放置 如果一樣就都會一起用
		System.out.println(a3 == a4); //所以a3 跟 a4都是相同物件哦 但a1跟a3就不一樣
		System.out.println(a3.charAt(3)); //charAt
		System.out.println(a3.substring(2, 6)); //substring只會return原字串不會更改a3內容 上週說過 java一但給定了內容就不會再更變,
													//你重新改變也就重新指向不再是原來的物件了
		
		System.out.println( "hamburger".substring(4, 8) );  //剛剛說只要雙引號（字串）就是物件 的範例 所以這樣寫也可以
		System.out.println("----------");
		
		String a5 = "Brad";
		String a6 = a5;
		System.out.println(a5 == a6);
		a5 = "peter";
				System.out.println(a5 == a6);
		System.out.println(a5.concat("Brad"));    //只印出a5 concat 加上字串但不會改變a5
		System.out.println(a5);
		System.out.println("==============");
		
		
		
		
		
		
		
	}

}
