package com.logicbuild;
//4 1 2 4 1 3 2
//o/p: 3
import java.util.HashMap;
import java.util.Map;
public class UniqueElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,2,4,1,3,2};
		//1. create a hashmap
		HashMap<Integer, Integer> hs = new HashMap<>();
		//2. store the count
		for(int num:arr)
		{
			hs.put(num, hs.getOrDefault(num, 0)+1);
		}
		//3. get single number
		for(Map.Entry<Integer, Integer> entry : hs.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}

