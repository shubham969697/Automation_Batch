package com.javaprogram;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Heart";
		String str2 = "Sarth";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Not anagrams");
		}
		else
		{
			char ch[] =str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch, ch2)== true)
			{
				System.out.println("String are anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
	}

}
