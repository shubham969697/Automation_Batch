package com.javaprogram;

public class SwappingTwoNumber {

	public static void swap(int a, int b)
	{
		System.out.println("Before a:"+a+"b:"+b);
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("Before a:"+a+"b:"+b);
		
		a = a+b;	//a = 10+11=21
		b = a-b;	//b = 21-11 =10 
		a = a-b;	//a = 21-10 =11
		
		System.out.println("a:"+a+"b:"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swap(10,11);
	}

}
