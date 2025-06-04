package com.javaprogram;

public class StringPallindrome {

	public static boolean pallindrome(String str)
	{
		int left=0,right=str.length()-1;
		
		while(left<right)
		{
			if(str.charAt(left) != str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Marvell";
		str = str.toLowerCase();
		
		if(pallindrome(str))
		{
			System.out.println("Pallindrome");
		}
		else
		{System.out.println("Not Pallindrome");}
	}

}
