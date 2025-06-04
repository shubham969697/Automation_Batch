package com.javaprogram;

public class ReverseNumber {

	public static void reverse(int num)
	{
		int rev=0;
		int rem=0;
		System.out.println(num);
		while(num != 0)
		{
			rem = num % 10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse(12);
	}

}

