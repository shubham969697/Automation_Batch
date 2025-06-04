package com.javaprogram;

public class PrimeBetween {

	public static boolean prime(int num)
	{
		
		for(int i=2;i<num;i++)
		{
			if(num % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=1,n2=100;
		
		for(int i=n1;i<=n2;i++)
		{
			if(prime(i))
			{
				System.out.print(" "+i);
			}
		}
	}

}
