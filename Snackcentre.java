package com.demo.assignment5;

import java.util.Scanner;

public class Snackcentre {

	public static void main(String[] args) {
		int i = 0,n = 0,m,j,r1=0,r2=0,r3=0,r4=0,h,result;
		System.out.println("Welcome to snack centre");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of atoms you want to buy");
		m= sc.nextInt();
		
		
		for(j=1;j<=m;j++)
		{
		System.out.println("Enter your choice 1.tea 2.Green tea 3.samosa 4.sandwitch");
		i = sc.nextInt();
		
		
		{
		switch(i)
		{
		case 1:
			System.out.println("Enter quantity of tea");
			n= sc.nextInt();
			r1=n*10;
			System.out.println("tea quantity="+n);
			break;
		case 2:
			System.out.println("Enter quantity of green tea");
			n= sc.nextInt();
			r2=n*15;
			System.out.println(" green tea quantity="+n);
			break;
		case 3:
			System.out.println("Enter quantity of samosa");
			n= sc.nextInt();
			r3=n*20;
			System.out.println("samosa quantity="+n);
			break;
		case 4:
			System.out.println("Enter quantity  of sandwitch");
			n= sc.nextInt();
			r4=n*50;
			System.out.println("sandwitch="+n);
			break;
		default:
			System.out.println("Please enter valid input");
				
		}
		}
		}
		System.out.println("You are now in the billing counter enter 5 to generate bill");
		h=sc.nextInt();
		switch(h)
		{
		case 5:
			
			result=r1+r2+r3+r4;
			System.out.println("your bill is ="+result+" rupees");
			break;
		default:
			System.out.println("invalid input please enter 5");
		}
		
		
		
				
			
		
		
		
		
		
		
		
		
		

	}

}
