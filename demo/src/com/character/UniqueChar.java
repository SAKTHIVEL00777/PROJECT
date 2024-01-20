package com.character;

public class UniqueChar {

	public static void main(String[] args) {

		String word = "SAKTHI";
		boolean result = true;

		for(int i = 0 ; i < word.length()- 1 ; i++)
		{
		for(int j = i+1; j < word.length() ; j++)
		{
		if(word.charAt(i)==word.charAt(j))
		{
		result = false;
		}
		}
		}
		System.out.println(" String has all unique character: " + result);
	}

}
