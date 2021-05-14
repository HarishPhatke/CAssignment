package com.demo.CDACAssignment;

import java.util.Scanner;

public class Compoundinterest {

	public static void main(String[] args) {
		float a, p, r, n, t;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial principal balance");
		p = s.nextFloat();
		System.out.println("Enter rate of interest");
		r = s.nextFloat();
		System.out.println("Enter number of time period applied");
		n = s.nextFloat();
		System.out.println("Enter number of time period elapsed");
		t = s.nextFloat();
		a = p * (1 + (r / n)) * n * t;
		System.out.println("final ammount=" + a);

	}

}
