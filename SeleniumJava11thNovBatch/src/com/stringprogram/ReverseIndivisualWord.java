package com.stringprogram;

public class ReverseIndivisualWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Capgemini India";
		String[] words = str.split(" ");
		String result="";
		
		for(String word : words)
		{
			String rev="";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				rev = rev + word.charAt(i);
			}
			result = result + rev + " ";
		}
		System.out.println(result.trim());
	}

}
