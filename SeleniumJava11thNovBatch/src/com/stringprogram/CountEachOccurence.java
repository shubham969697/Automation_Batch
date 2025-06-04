package com.stringprogram;

import java.util.HashMap;

public class CountEachOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		str = str.toLowerCase();
		
		HashMap<Character, Integer> hs = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			hs.put(ch, hs.getOrDefault(ch, 0)+1);
		}
		for(char c : hs.keySet())
		{
			System.out.println(c+ " " + hs.get(c));
		}
	}

}
