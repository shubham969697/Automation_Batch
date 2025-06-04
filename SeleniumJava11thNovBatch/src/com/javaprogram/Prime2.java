package com.javaprogram;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=13;
		int count=0;
		
		for(int i=2;i<=no/2;i++)
		{
			if(no % i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not prime");
		}
	}

}
