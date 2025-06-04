package com.javaprogram;

import java.util.Arrays;

public class SecondMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {11,21,51,101};
		Arrays.sort(arr);
		
		int min = arr[1];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("second Min no is :"+min);
	}

}
