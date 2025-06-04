package com.javaprogram;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1=0;
		int no2=1;
		
		while(no1<10)
		{
			System.out.print(" "+no1);
			int no3=no1+no2;
			no1=no2;
			no2=no3;
		}
	}

}
