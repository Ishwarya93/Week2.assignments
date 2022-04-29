package week2.Assignment;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] x = test.split(" ");
		StringBuilder result = new StringBuilder();
		for( int i = 0; i < x.length; i += 1 )
	    {
	        if( i % 2 != 0 )
	        {
	            char[] word = x[i].toCharArray();
	            String RevWrd = "";
	            for( int r = word.length; r > 0; r-- )
	            {
	            	RevWrd += String.valueOf( word[r-1] );
	            }
	            result.append( RevWrd ).append( " " );
	        }
	        else
	        {
	            result.append( x[i] ).append( " " );
	        }
	    }
	    System.out.println( result.toString() );
		  
	        
		
	}

}
