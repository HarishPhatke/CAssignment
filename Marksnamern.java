package com.demo.CDACAssignment;

import java.util.Scanner;

public class Marksnamern {

	public static void main(String[] args) {
		int r,p,c,ca;
		float sum,pr;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		name= s.next();
		System.out.println("Enter Your roll number");
		r=s.nextInt();
		System.out.println("Enter Your marks in physics");
		p=s.nextInt();
		System.out.println("Enter Your marks in chemistry");
		c=s.nextInt();
		System.out.println("Enter Your marks in computer application");
		ca=s.nextInt();
		sum=p+c+ca;
		System.out.println("Total Marks= " +sum);
		pr=(sum/300)*100;
		System.out.println("Hi " +name+ " you got " +pr+ " precentage");
		
		
		
		

	}

}
