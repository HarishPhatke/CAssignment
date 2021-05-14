package com.demo.CDACAssignment;

import java.util.Scanner;

public class circlearea {

	public static void main(String[] args) {
		double r, a, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		r = s.nextDouble();
		a = Math.PI * r * r;
		c = 2*Math.PI * r;
		System.out.println("the area of the circle is" + a);
		System.out.println("the circumferance of circle is" + c);


	}

}
