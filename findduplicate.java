package com.edu.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findduplicate {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("a","b","c","d","a","c");
		Set<String> seen=new HashSet<>();
		Set<String> duplicate=new HashSet<>();
		for(String item:list) {
			if(!seen.add(item)) {
				duplicate.add(item);
			}
		}
		System.out.println("duplicate:"+duplicate);
		

	}

}
