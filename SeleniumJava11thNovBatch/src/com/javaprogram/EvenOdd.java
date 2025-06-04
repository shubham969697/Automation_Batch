package com.javaprogram;

public class EvenOdd {

	public static boolean evenOdd(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bret = false;
		bret = evenOdd(13);
		if(bret == true)
		{
			System.out.println("Even Num");
		}
		else
		{
			System.out.println("Odd no");
		}
	}

}
