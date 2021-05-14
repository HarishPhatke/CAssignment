package com.demo.CDACAssignment;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		float i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		i=s.nextFloat();
		if(i>18)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are not eligible for voting");
		}
		

	}

}
