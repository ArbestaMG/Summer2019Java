package replits;

public class HW172 {
/*
 at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

 */
	public static String at3(String target,String word){
	String real="";
	real+=""+target.charAt(0)+target.charAt(1)+target.charAt(2)+word;
	String real2="";
	for(int i=3;i<target.length();i++) {
		real+=""+target.charAt(i);
	}
	
		return real;
	  }
}
