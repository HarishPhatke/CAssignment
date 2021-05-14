package com.demo.CDACAssignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		float t;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the temperature");
		t=s.nextFloat();
		if(t<0)
		{
			System.out.println("Freezing temperature");
		}
		else if(t>=0&&t<=10)
		{
			System.out.println("very cold whether");
		}
		else if(t>10&&t<=20)
		{
			System.out.println("cold whether");
		}
		else if(t>20&&t<=30)
		{
			System.out.println("normal whether");
		}
		else if(t>30&&t<=40)
		{
			System.out.println("hot whether");
		}
		else
		{
			System.out.println("very hot whether");
		}

	}

}
