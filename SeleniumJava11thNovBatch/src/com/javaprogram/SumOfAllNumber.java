package com.javaprogram;

public class SumOfAllNumber {

	public static void sum(int num)
	{
		int rem,rev,sum=0;
		while(num != 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(1234);
	}

}
