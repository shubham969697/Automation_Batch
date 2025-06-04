package com.array;

import java.util.Arrays;

public class RemoveDuplicateElementArray {

	public static void main(String[] args) {
	
		int arr[] = {10,20,10,20,30,40,50,10,30};
		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int j=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		
		for(int k=0;k<j;k++)
		{
			System.out.println(temp[k]);
		}
	}

}
