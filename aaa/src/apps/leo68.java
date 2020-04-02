package apps;

import java.util.HashSet;

import aaa.Bike;
//Collection   set(不重複 沒順序性） list(可重複 有順序）
public class leo68 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");	//add只要是物件就行
		set.add(123);  // int > auto-boxing => Integer Object   （int不是物件但是也行  ˊ他把它包成整數物件
		set.add(new Bird());
		set.add(new Bike());
		set.add("Brad");	//set 不能重複
		set.add(new String("Brad")); //equals 是true 所以一樣不能重複
		set.add(new Bird());		//但new出一個新的物件就是不同的物件
		System.out.println(set.size());
	}

}
