package com.demo.CDACAssignment;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		i=s.nextInt();
		if(i%5==0&&i%3==0)
		{
			System.out.println("Number is divisible by 3 and 5");
		}
		else
		{
			System.out.println("number is not divisible");
		}

	}

}
