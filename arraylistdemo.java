package csea;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistdemo {
	public static void main (String[]args) {
		ArrayList<Integer> li=new ArrayList();
		li.add(100);
		li.add(600);
		li.add(500);
		li.add(500);
		li.add(200);
		System.out.println(li);
		for(int all:li) {
			System.out.println(all);
		}
		Collections.sort(li);
		System.out.println(li);
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
	}
}


