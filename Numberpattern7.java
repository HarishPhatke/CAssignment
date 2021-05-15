package com.demo.CDACAssignment;

public class Numberpattern7 {

	public static void main(String[] args) {
		int i,j,k=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(((i==4)&&(j<=4)))
				{
					System.out.print(k+3);
				}
				else if(((i==3)&&(j<=3)))
				{
					System.out.print(k+2);
				}
				else if(((i==2)&&(j<=2)))
				{
					System.out.print(k+1);
				}
				else if((i==1)&&(j==1))
				{
					System.out.print(k);
				}
			}
			System.out.println("");
		}


	}

}
