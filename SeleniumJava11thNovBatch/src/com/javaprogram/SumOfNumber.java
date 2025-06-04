package com.javaprogram;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int rev,rem,sum=0;
		
		while(num != 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
