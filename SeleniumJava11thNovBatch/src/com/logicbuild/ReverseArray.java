package com.logicbuild;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,30,40,50};
		
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print("\t"+arr[i]);
//		}
		
		int start=0,end=arr.length-1;
		
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("\t"+arr);
	}

}
