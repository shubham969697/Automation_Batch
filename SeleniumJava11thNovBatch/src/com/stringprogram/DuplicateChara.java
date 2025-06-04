package com.stringprogram;

public class DuplicateChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Gajanan";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			//char ch = str.charAt(i);
			
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					System.out.println(str.charAt(j));
					break;
				}
			}
			
		}
	}

}
