package com.stringprogram;

public class ReverseEvenIndex {

	public static String reverseWord(String str)
	{
		String rev ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I Love India, I am Shubham Gawade";
		String words[] = str.split(" ");
		
		
		for(int i=0;i<words.length;i++)
		{
			
			if(i % 2 != 0)
			{
				words[i] = reverseWord(words[i]);
			}
			
		}
		
		String result="";
		for(int i=0;i<words.length;i++)
		{
			result = result + words[i];
			
			if(i < words.length-1)
			{
				result = result + " ";
			}
		}
		System.out.println(result.trim());
	}
}
