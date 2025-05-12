package com.edu.set;

import java.util.Hashtable;
import java.util.Map;

public class hashtabledemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable<>();
		map.put(1,"apple");
		map.put(2,"mango");
		map.put(3,"banana");
		System.out.println("after put:"+map);
	
		Map<String,String> map1 = new Hashtable<>();
		map1.put("1jb22cs001","ar");
		map1.put("1jb22cs002","bl");
		map1.put("1jb22cs003","cl");
		System.out.println("after put:"+map1);
		
}
}