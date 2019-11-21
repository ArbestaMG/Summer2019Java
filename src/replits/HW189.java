package replits;
/*
 isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:
 */
public class HW189 {
	
public static void main(String[] args) {
	
	
}

}

 class reality {
	public static void main(String[] args) {
		   String words="error foo bar";
	          isError(words);
	          
	        System.out.println(isError(words));
	}
	
	
	  public static boolean isError(String line)   {

			  if(line.startsWith("error")) {
				return true;}
			  
			  else {
				  return false;
			  }
		  
		  
	  }
	  
	}
