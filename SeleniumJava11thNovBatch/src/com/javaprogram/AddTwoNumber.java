package com.javaprogram;

import java.util.Scanner;

public class AddTwoNumber {

	public static int Addition(int x, int y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		System.out.println("Enter second no");
		int no2 = sc.nextInt();
		
		System.out.println("Add is :"+Addition(no,no2));
	}

}
