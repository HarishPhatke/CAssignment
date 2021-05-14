package com.demo.CDACAssignment;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int n, x, rev = 0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		n = s.nextInt();
		temp=n;
		while (n > 0) {
			x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		if(rev==temp)
		{
			System.out.println("entered number is palindrome");
		}
	}

}
