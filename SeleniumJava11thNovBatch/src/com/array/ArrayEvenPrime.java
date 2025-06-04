package com.array;

public class ArrayEvenPrime {

	public static boolean isPrime(int num)
	{
		
		for(int i=2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,3,4,5,6,7,8,9,10,11,13,15,17,19,20};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println("Even no are"+arr[i]);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println("Prime no are"+arr[i]);
			}
		}
	}

}
