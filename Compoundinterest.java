package com.demo.CDACAssignment;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Compoundinterest {

	public static void main(String[] args) {
		float  p, r, n, t;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial principal balance");
		p = s.nextFloat();
		System.out.println("Enter rate of interest");
		r = s.nextFloat();
		System.out.println("Enter number of time period applied");
		n = s.nextFloat();
		System.out.println("Enter number of time period elapsed");
		t = s.nextFloat();
		double num =(1+(r/n));
		double pow = n*t;
		double a = (float)Math.pow(num, pow);
		a = a*p;
		
		DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(a));
		//System.out.println("final ammount=" + a);

	}

}
