package com.javaprogram;

public class FactorSum {

	public static void factor(int num)
	{
		int sum=0;
		
		for(int i=1;i<=num/2;i++)
		{
			if(num % i ==0)
			{
				sum = sum +i;
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factor(12);
	}

}
