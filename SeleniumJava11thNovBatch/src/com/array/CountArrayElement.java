package com.array;

import java.util.Arrays;

public class CountArrayElement {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,10,20,40,10,50};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			
			while(i<arr.length-1 && arr[i] == arr[i+1])
			{
				i++;
				count++;
			}
			System.out.println(arr[i]+" : "+count);
		}
	}

}
