package com.stringprogram;

import java.util.Scanner;

class Demo2
{
	public void countDiff(String str)	//Marvellous
	{
		char arr[] = str.toCharArray();
		int i=0, size=str.length();
		int count=0;
		
		while(i<size)
		{
			if(arr[i]>='a' && arr[i]<='z')
			{
				count++;
			}
			else if(arr[i]>='A' && arr[i]<='Z')
			{
				count--;
			}
			i++;
		}
		System.out.println("diff is :"+count);
	}
}
public class DiffBetwChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		Demo2 demo = new Demo2();
		demo.countDiff(str);
	}

}
