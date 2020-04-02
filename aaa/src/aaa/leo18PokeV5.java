package aaa;

import java.util.Collections;
import java.util.LinkedList;

public class leo18PokeV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 幾張牌
		int x = 52;
		
		LinkedList<Integer> poker = new LinkedList<>();
		for(int i = 0 ; i<x; i++) poker.add(i);
		Collections.shuffle(poker);
		
		for (Integer v : poker) {
			System.out.println(v);
		}
		
		
		
		
		
		
		
		
	}

}
