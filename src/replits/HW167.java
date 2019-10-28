package replits;
import java.util.*;
public class HW167 {
/*	uniqueChars is a method that you will code now, should be 
  able to accept any string in the world and return unique characters from the parameter.

			Examples:

			uniqueChars("java") ==> "jav"

			uniqueChars("mama") ==> "ma"

			uniqueChars("spoon") ==> "spon"
*/
	 public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("wooden-spoon") ) ;
		  }
		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
			 
String result="";
for(int i=0; i<str.length(); i++){
  if(!result.contains(str.substring(i,i+1))){
    result +=str.substring(i, i+1);
  }
}
return result;
}}