package com.demo.CDACAssignment;

import java.util.Scanner;

public class Printminusplusone {

	public static void main(String[] args) 
	{
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		i=s.nextInt();
		if(i>0)
		{
			System.out.println(1);
		}
		else if(i<0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(0);
		}


	}

}
