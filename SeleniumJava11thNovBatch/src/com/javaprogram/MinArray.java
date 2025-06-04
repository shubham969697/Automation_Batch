package com.javaprogram;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,100,23,45,10,-1};
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("min array :"+min);
	}

}
