package com.edu.set;

import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) {
		int flag=0;
		System.out.println("enter no.");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(i%n==0) {
				flag=0;
			}
			else {
				flag=1;
			}
			
		}
		if(flag==0) {
			System.out.println("non prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
