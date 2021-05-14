package com.demo.CDACAssignment;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year");
		y=s.nextInt();
		if(y%4==0)
		{
			System.out.println("entered year "+y+" is leap year");
		}
		else
		{
			System.out.println("entered year "+y+" is not  leap year");
		}

	}

}
