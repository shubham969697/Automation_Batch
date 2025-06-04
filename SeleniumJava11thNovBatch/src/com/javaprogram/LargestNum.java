package com.javaprogram;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=111, num2=111, num3=111;
		
		if(num1==num2 || num1==num3 || num2 == num3)
		{
			System.out.println("All no are same");
		}
		if(num1> num2 && num1>num3)
		{
			System.out.println("Num1 is greater");
		}
		else if(num2>num3)
		{
			System.out.println("Num2 is greater");
		}
		else
		{
			System.out.println("Num3 is greater");
		}
	}

}
