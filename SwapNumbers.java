package com.demo.helloworld;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first Number");
		a=s.nextInt();
		System.out.println("Enter second Number");
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("a= "+a+" b= "+b);
		

	}

}
