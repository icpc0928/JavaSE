package apps;

import java.util.LinkedList;

public class leo70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0,1);	// 1
		list.add(0,2);	// 2 1
		list.add(2,3);	// 2 1 3
		list.add(0,4);	// 4 2 3 1
//		System.out.println(list.size());  			//可以重複 也可以for each
		
		
		
		for (Integer it : list) {
			System.out.println(it);
		}
		
		System.out.println();
		System.out.println(list.get(1));
		System.out.println();
		
		for(int i= list.size()-1 ; i>=0 ; i--) {
			System.out.println(list.get(i));
		}
		
	}

}
