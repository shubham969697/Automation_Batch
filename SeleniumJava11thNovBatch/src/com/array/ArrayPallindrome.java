package com.array;

public class ArrayPallindrome {

	public static void Pallindrome(int arr[], int n)
	{
		int flag=0;
		for(int i=0;i<=n/2 && n!=0; i++)
		{
			if(arr[i] != arr[n-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not Pallindrome");
		}
		else
		{
			System.out.println("Pallindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,1,2};
		int n=arr.length;
		 Pallindrome(arr,n);
	}

}
