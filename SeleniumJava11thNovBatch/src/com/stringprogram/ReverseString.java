package com.stringprogram;

import java.util.Scanner;

class Demo
{
	public void revString(String str)	//Marvellous
	{
		char arr[] = str.toCharArray();
		char temp;
		int iStart=0, iEnd=str.length()-1;
		
		while(iStart<iEnd)
		{
			temp = arr[iStart];
			arr[iStart]= arr[iEnd];
			arr[iEnd] = temp;
			
			iStart++;
			iEnd--;
		}
		
		String string = new String(arr);
		System.out.println(string);
	}
}
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		Demo demo = new Demo();
		demo.revString(str);
	}

}
