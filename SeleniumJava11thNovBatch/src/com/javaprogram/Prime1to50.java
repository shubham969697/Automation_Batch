
package com.javaprogram;

public class Prime1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		
		for(int i=1;i<=50;i++)
		{
			for(int j=2; j<=i/2;j++)
			{
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}

}
