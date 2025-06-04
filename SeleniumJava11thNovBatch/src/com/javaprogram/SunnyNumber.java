package com.javaprogram;
//23+1=24	Not sunny no
//24+1=25   sunny no

public class SunnyNumber {

	public static void sunnyNumber(int num)
	{
		int flag=1;
		
		for(int i=1;i<=num/2;i++)
		{
			if(num + 1 == i*i)
			{
				flag=0;
				System.out.println("sunny no:"+num);
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not sunny no");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sunnyNumber(15);
	}

}
