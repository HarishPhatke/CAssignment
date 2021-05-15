package com.practice.assignment3;

public class Facepattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if ((i==2)&&(j==1))
				{
					System.out.print("{");
				}
				else if((i==2)&&(j==9))
				{
					System.out.print("}");
				}
				else if(((i==1)||(i==5))&&((j==8)||(j==2)))
				{
					System.out.print("+");
				}
				else if(((i>=2)||(i<=4))&&((j==8)||(j==2)))
				{
					System.out.print("|");
				}
				else if((i==5)&&((j>=3)&&(j<=7)))
				{
					System.out.print("-");
				}
				else if((i==1)&&(j>=3&&j<=7))
				{
					System.out.print("'");
				}
				else if((i==2)&&((j==4)||(j==6)))
				{
					System.out.print("0");       
				}
				else if((i==4)&&((j==4)||(j==6)))
				{
					System.out.print("'");       
				}
				else if((i==4&&j==5))
				{
					System.out.print("-");
				}
				else if((i==3&&j==5))
				{
					System.out.print("^");
				}
				else 
				{
					System.out.print(" ");
				}
				
					
				
			}
		System.out.println("");
			
			
		}
		
	}
	
}
