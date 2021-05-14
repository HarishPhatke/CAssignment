package com.demo.CDACAssignment;

import java.util.Scanner;

public class Largerfromtwo {

	public static void main(String[] args) {
	int a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the first number");
	a=s.nextInt();
	System.out.println("Enter the first number");
	b=s.nextInt();
	if(a>b)
	{
		System.out.println("The larger number is "+a);
	}
	else
	{
		System.out.println("The larger number is"+b);
	}
	

	}

}
