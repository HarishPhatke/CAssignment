package com.demo.CDACAssignment;

import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		i=s.nextInt();
		if(i>0)
		{
			System.out.println("Entered number is positive");
		}
		else
		{
			System.out.println("Entered number is negative");
		}

	}

}
