package com.stringprogram;

public class Demotp {

	public static void main(String[] args) {
		//System.out.println("Jay Ganesh");
		
		String str = "Hello Java";
		str= str.toLowerCase();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}


