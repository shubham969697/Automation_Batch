package com.javaprogram;

public class PerfectSquare {

	public static void pSquare(int num)
	{
		int flag=0;
		for(int i=1;i<=num/2;i++)
		{
		
			if(num == i*i)
			{
				flag=1;
				System.out.println("perfect square"+num);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Not perfect square");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pSquare(9);
	}

}
