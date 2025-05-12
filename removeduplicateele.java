package com.edu.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeduplicateele {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList();
		li.add(100);
		li.add(600);
		li.add(500);
		li.add(100);
		System.out.println(li);
		Set<Integer> set=new HashSet<>(li);
		System.out.println(set);

}
}
