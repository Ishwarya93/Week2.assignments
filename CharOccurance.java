package week2.Assignment;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int a=0;
		
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == 'e')
		      {
		        a++;
		      }
		    }
		    System.out.println("Total number of occurence of character " + 'e' + " is: " + a);
		}
	}



