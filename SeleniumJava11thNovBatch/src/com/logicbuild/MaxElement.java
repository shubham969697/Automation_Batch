package com.logicbuild;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,200,30,100,20};
		int max = arr[0];
		
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
