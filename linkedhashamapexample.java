package com.edu.set;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashamapexample {

	public static void main(String[] args) {
		Map<Integer,String> map= new LinkedHashMap<>();
		map.put(4, "banana");
		map.put(1,"apple");
		map.put(3, "cherry");
		map.put(2, "banana");
		System.out.println("after put:"+map);
	}

}
