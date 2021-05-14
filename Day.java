package com.demo.CDACAssignment;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7");
		i=s.nextInt();
		switch (i) 
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Enter valid input");
			
		}

	}

}
