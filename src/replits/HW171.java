package replits;

public class HW171 {
/*
 This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */
	public static String limit(String text, int maxLength)
	  {
	    String real="";
	    for(int i=0;i<maxLength;i++) {
	    	real+=""+text.charAt(i);
	    }
	    return real;
	  }
}
