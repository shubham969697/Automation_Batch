package com.javaprogram;

public class Factor {

	public static void factor(int num)
	{
		
		for(int i=1;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				System.out.print(" "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factor(20);
	}

}
