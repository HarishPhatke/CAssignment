package com.demo.CDACAssignment;

import java.util.Scanner;

public class Arearectangle {

	public static void main(String[] args) {
		float w,h,a,p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter width ");
		w = s.nextFloat();
		System.out.println("Enter height ");
		h= s.nextFloat();
		a=w*h;
		System.out.println("The area of rectangle is equal to "+a);
		p=2*(w+h);
		System.out.println("The perimeter of rectangle is equal to "+p);
		
		

	}

}
