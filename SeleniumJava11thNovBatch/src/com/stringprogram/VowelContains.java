package com.stringprogram;

import java.util.Scanner;

class Demo1
{
	public boolean isVowel(String str)
	{
		str = str.toLowerCase();
		char arr[] = str.toCharArray();
		int i=0;
		int j=str.length();
		boolean bRet = false;
		
		while(i<j)	//Marvellous
		{
			if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u' )
			{
				bRet=true;
				break;
				
			}
			i++;
		}
		return bRet;
	}
}
public class VowelContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		Demo1 demo = new Demo1();
		boolean b = demo.isVowel(str);
		if(b==true)
		{
			System.out.println("Vowel are present in string");
		}
		else
		{
			System.out.println("Not vowel");
		}
	}

}
