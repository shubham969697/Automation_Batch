package com.javaprogram;

import java.util.Arrays;

public class SecondHighestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {11,21,51,101};
		Arrays.sort(arr);
		
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		System.out.println(max);
	}

}
