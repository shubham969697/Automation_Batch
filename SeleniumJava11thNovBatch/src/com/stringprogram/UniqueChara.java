package com.stringprogram;

import java.util.HashMap;

public class UniqueChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Gajanan";
		
		HashMap<Character, Integer> hs = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			hs.put(ch,hs.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : hs.keySet())
		{
			if(hs.get(ch)==1)
			{
				System.out.println(ch);
			}
		}
	}

}
