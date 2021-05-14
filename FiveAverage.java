package com.demo.CDACAssignment;

import java.util.Scanner;

public class FiveAverage {

	public static void main(String[] args) {
		int a,b,c,d,e;
		float avg,sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter second number");
		b = s.nextInt();
		System.out.println("Enter third number");
		c = s.nextInt();
		System.out.println("Enter fourth number");
		d = s.nextInt();
		System.out.println("Enter fifth number");
		e = s.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("the average of five numbers is equal to "+avg);
		

	}

}
