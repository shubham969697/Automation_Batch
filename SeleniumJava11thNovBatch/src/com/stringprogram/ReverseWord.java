package com.stringprogram;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I Love India";
		String[] words = str.split(" ");
		String output="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			output=output+words[i]+" ";
		}
		System.out.println(output.trim());
	}

}
