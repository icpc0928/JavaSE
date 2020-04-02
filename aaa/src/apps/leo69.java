package apps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//hashSet 沒順序     treeSet  (SortedSet) 有排序性 不重複
public class leo69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();				//設定好set內的範型只能是integer      //treeset就是二元樹（資料結構） 他就會由小到大排序
//		set.add(123);
//		set.add("brad");  //這樣編譯失敗
//		set.add(2000);
//		set.add(300000);
//		set.add(300000);
//		System.out.println(set.size());				//一樣不會重複
		
		
		//出樂透的號碼
		while(set.size() < 6) {
			set.add((int)(Math.random()*49+1));
			
		}
		System.out.println(set.toString());
		
		//迭代器
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer temp = it.next();            //把set內的東西拿出來 讓他可以真正使用
			System.out.println(temp);         
		}
		System.out.println("=======================");
		
		//for each 用在 collection上
		
		for(Integer it2 : set) {
			System.out.println(it2);
		}
		
		
		
		
	}

}
