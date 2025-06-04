package com.javaprogram;

public class StringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc123abc1";
		String num = "";
			
		char ch[] = str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			char c = ch[i];
			if(c>='0' && c<='9')
			{
				num = num + c;
			}
		
		}
		System.out.println(num);
	}

}
