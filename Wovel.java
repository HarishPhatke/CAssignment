package com.demo.CDACAssignment;

import java.util.Scanner;

public class Wovel {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = s.next().charAt(0);   
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Entered character is wovel");
		
		}
		else
		{
			System.out.println("Entered character is not wovel");
		}

	}

}
