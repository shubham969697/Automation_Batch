package com.javaprogram;

public class PrimeNumber {
	
	public static void prime(int num)
	{
		int flag=1;
		for(int i=2;i<num;i++)
		{
			if(num % i == 0)
			{
				flag=0;
				System.out.println("Not prime no:"+num);
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Prime no");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prime(23);
		//int num=12;
		/*int i=2;
		
		while(i<num)
		{
			if(num % i == 0)
			{
				System.out.println(num+"is not prime");
				break;
			}
			i++;
		}
		if(i==num)
			System.out.println(num+"prime no");
		*/
	}

}
