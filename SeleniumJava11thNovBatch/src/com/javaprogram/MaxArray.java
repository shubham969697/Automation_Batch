package com.javaprogram;

public class MaxArray {

	public static void main(String[] args) {

		int arr[] = {10,1000,500,2,3};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("max array is :"+max);
	}

}
