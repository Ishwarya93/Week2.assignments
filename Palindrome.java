package week2.Assignment;

public class Palindrome {
	public static void main(String[] args) {
		String Value ="madam";
		String rev ="";
		if(Value.length()!=0 && Value.length()!=4 ) {
			for(int i= Value.length()-1;i>0;i--) {
				rev = rev+Value.charAt(i);
				if(rev.equalsIgnoreCase(Value)) {
					System.out.println("The given string is a palindrome");
				}
				else {
					System.out.println("The given string is not a palindrome");
				}
				
				}
			}
		}
	}


