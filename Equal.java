package com.demo.CDACAssignment;

import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		n=s.nextInt();
		System.out.println("Enter second number");
		m=s.nextInt();
		if(n==m) 
		{
			System.out.println("Entered number are equal");
		}
		else
		{
			System.out.println("Entered number are not  equal");
		}


	}

}
