package csea;

import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();
		list.add("alice");
		list.add("bob");
		list.add("charlie");
		System.out.println("linked list:"+list);
		list.addFirst("first");
		list.addLast("last");
		list.add(null); 
		System.out.println("after adding first and last:"+list);
		list.remove("bob");
		System.out.println("after removing:"+list);
		 System.out.println("1st ele:"+list.getFirst());
		 System.out.println("last ele:"+list.getLast());
	}

}
