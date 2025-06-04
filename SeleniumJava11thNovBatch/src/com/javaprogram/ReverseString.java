package com.javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am a boy";
		String rev = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Rev string is :"+rev);
	}

}
