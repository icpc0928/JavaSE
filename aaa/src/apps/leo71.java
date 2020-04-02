package apps;

import java.util.HashMap;

public class leo71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<>();
		map.put("name","Brad");
		map.put("gender",true);
		map.put("age",18);
		map.put("age",19);						//key重複 其值會被覆蓋
		System.out.println(map.get("name"));
		System.out.println(map.get("gender"));
		System.out.println(map.get("age"));
		
		
		
		
		
	}

}
