package week2.Assignment;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	if(text1.length()==text2.length())
	{
		char[] text1Array = text1.toCharArray();
		char[] text2Array = text2.toCharArray();
		Arrays.sort(text1Array);
		Arrays.sort(text2Array);
		if(Arrays.equals(text1Array, text2Array))
		{
			System.out.println(text1 + " and " + text2 + " are anagram.");
		}
		
		 else 
		{
			System.out.println(text1 + " and " + text2 + " are not anagram.");
		}
	}
}
}
