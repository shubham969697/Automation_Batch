package com.stringprogram;

import java.util.HashMap;

public class CountEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am shu shu shu";
		str=str.toLowerCase();
		String[] words = str.split(" ");
		
		HashMap<String, Integer> hs = new HashMap<>();
		
		for(String word : words)
		{
			hs.put(word, hs.getOrDefault(word, 0)+1);
		}
		for(String s : hs.keySet())
		{
			if(hs.get(s)>1)
				System.out.println(s);
			//System.out.println(s+ " " + hs.get(s));count each word
		}
	}

}
