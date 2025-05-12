package com.edu.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashtableexample {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);
		map.put("e", 400);
		System.out.println("after put "+map);
		System.out.println("value of b "+map.get("b"));
		
		Set<String> keys = map.keySet();
		System.out.println("all keys:"+keys);
		
		Collection<Integer> values = map.values();
		System.out.println("all vals:" + values);
		
		System.out.println("map size:"+map.size());
		
		System.out.println("is map empty?"+ map.isEmpty());
		
		map.clear();
		System.out.println("after clear:"+map);
		
	}

}
