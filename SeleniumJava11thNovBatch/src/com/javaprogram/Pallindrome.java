package com.javaprogram;

public class Pallindrome {

	public static  void pallindrome(int num)
	{
		int temp = num;
		int rev=0;
		int rem=0;
		
		while(num !=0)
		{
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		
		if(temp == rev)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pallindrome(111);
	}

}
