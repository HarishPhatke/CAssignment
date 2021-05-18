package com.demo.CDACAssignment;

import java.util.Scanner;

public class Circlemethod {
     static float area;
	static float peri;
	public static void main(String[] args) {
		float r,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circle");
		r= sc.nextFloat();
		calculateArea(r);
		System.out.println("Area of circle is "+area);
		calculatePerimeter(r);
		System.out.println("Perimeter of circle "+peri);
		

	}
	public static float calculateArea(float r)
	{
		
		area=r*r;
		return area;
	}
	public static float calculatePerimeter(float r)
	{
		
		float pi=(float) 3.14;
		peri=2*pi*r;
		return peri;
	}

}
