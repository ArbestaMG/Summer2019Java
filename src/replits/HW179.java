package replits;

public class HW179 {
	/*
	 reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
	 */
	public static String reverse(String input)
	{
	   String real="";
	   
	   for(int i=input.length()-1;i>=0;i--) {
		   real+=input.charAt(i);
	   }
	   return real;
	}
}
