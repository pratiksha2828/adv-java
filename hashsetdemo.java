package com.edu.set;

import java.util.HashSet;

public class hashsetdemo {
	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("apple");
		System.out.println(set);
		
		for(String i:set) {
			System.out.println("vals are:"+i);
		}
	}

}
