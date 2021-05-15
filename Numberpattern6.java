package com.demo.CDACAssignment;

public class Numberpattern6 {

	public static void main(String[] args) {
		int i,j,k=1;
		for(i=1;i<=4;i++)
		{
			for(j=0;j<=4;j++)
			{
				if(((i>=1)&&(i<=4))&&(j==1))
				{
					System.out.print(k);
				}
				else if(((i>=2)&&(i<=4))&&(j==2))
				{
					System.out.print(k+1);
				}
				else if(((i>=3)&&(i<=4))&&(j==3))
				{
					System.out.print(k+2);
				}
				else if((i==4)&&(j==4))
				{
					System.out.print(k+3);
				}
			}
			System.out.println("");
		}

	}

}
