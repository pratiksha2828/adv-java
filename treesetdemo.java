package com.edu.set;

import java.util.TreeSet;

public class treesetdemo {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(50);
		set.add(30);
		set.add(28);
		System.out.println(set);
		System.out.println("first"+set.first());
		System.out.println("last"+set.last());
		System.out.println("lower(30)"+set.lower(30));
		System.out.println("higher(30)"+set.higher(30));
		System.out.println("headset(30)"+set.headSet(30));
		System.out.println("tailset(30)"+set.tailSet(30));

	}

}
