package com.demo.CDACAssignment;

import java.util.Scanner;

public class Grademessage {

	public static void main(String[] args) {
		int p,c,m;
		float sum,avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks in physics out off 100");
		p=s.nextInt();
		System.out.println("Enter the marks in chemistry out off 100");
		c=s.nextInt();
		System.out.println("Enter the marks in maths out off 100");
		m=s.nextInt();
        sum=p+c+m;
        avg=sum/3;
        if(avg>=30&&avg<60)
        {
        	System.out.println("You passed with second division");
        }
        else if(avg>=60&&avg<80)
        {
        	System.out.println("You passed with fiear division");
        }
        else 
        {
        	System.out.println("you passed in distinction");
        }
        
        	
        }
	}


