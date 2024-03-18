package Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoMao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "balu");
		map.put(2, "benny");
		map.put(3, "aluri");
		map.put(1, "jaswanth");
		System.out.println(map.containsKey(1));
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}

	}

}
