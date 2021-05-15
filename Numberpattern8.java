package com.demo.CDACAssignment;

public class Numberpattern8 {

	public static void main(String[] args) {
		int i,j,k=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if((i==1)&&(j==1))
				{
					System.out.print(k);
					k++;
				}
				else if(((i==2)&&(j<=2)))
				{
					System.out.print(k);
					k++;
				}
				else if(((i==3)&&(j<=3)))
				{
					System.out.print(k);
					k++;
				}
				else if(((i==4)&&(j<=4)))
				{
					System.out.print(k);
					k++;
				}
				
			}
			System.out.println("");
		}

	}

}
