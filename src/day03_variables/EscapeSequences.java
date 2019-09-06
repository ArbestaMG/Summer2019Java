package day03_variables;

public class EscapeSequences {
	/*
	 \n (or \r): starts from a new line
	 */
 public static void main(String[] args) {
	System.out.println("Hello Cybertek\nBatch 12 students");
	
	System.out.print("Tommorow is off\n");
	System.out.print("True");
	System.out.print("Wrong\r");
	System.out.print("False\n\n");
	/*
	 \t: gives paragraph tab
	 */

	
	
	System.out.println("\t Class stars tomorrow");
	
	/*
	 \\: creates \ (backslash)
	 */
	System.out.println("\\School");
	/*
	 \': creates ' (single quote)
	 */
	System.out.println("\'Hello");
	/*
	 \'': creates '' (double quote)
	 */
	System.out.println("\''Class tomorro");
	System.out.println("\"");
	
	 String phoneNumber="Calling number";
	  int areaCode=222;
	  int localNumber=3334444;
	  System.out.println(phoneNumber+"("+areaCode+")"+"-"+localNumber);
 }
}
