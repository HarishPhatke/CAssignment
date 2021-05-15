package com.demo.helloworld;

import java.util.Scanner;

public class OddEven {

	
	public static void main(String[] args) 
	{
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to check even or odd");
		i=s.nextInt();
		if(i%2==0)
		{
			System.out.println("entered no "  +i+  " is even number");
		}
		else
		{
			System.out.println("entered no "+i+" is odd number");
		}

	}

}
