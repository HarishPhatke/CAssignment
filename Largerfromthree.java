package com.demo.CDACAssignment;

import java.util.Scanner;

public class Largerfromthree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		a=s.nextInt();
		System.out.println("Enter the second number");
		b=s.nextInt();
		System.out.println("Enter the third number");
		c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The larger number is "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("The larger number is"+b);
		}
		else
		{
			System.out.println("The larger number is"+c);
		}
		


	}

}
