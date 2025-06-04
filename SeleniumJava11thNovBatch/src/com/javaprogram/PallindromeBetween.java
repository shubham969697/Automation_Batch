package com.javaprogram;

public class PallindromeBetween {

	public static boolean pallindrome(int num)
	{
		int temp=num;
		int rev = 0,rem=0;
		
		while(num != 0)
		{
			rem = num % 10;
			rev = rev*10+rem;
			num = num/10;
		}
		return temp == rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=100,n2=1000,k=0;
		
		for(int i=n1;i<=n2;i++)
		{
			if(pallindrome(i))
			{
				k++;
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("Count is :"+k);
	}

}
