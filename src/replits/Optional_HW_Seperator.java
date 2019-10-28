package replits;

import java.util.Scanner;

public class Optional_HW_Seperator {
/*
 Given two strings, word and a separator sep,

Scanner scan = new Scanner(System.in);
String word = scan.next();
String separator = scan.next();

int count = scan.nextInt( );

 

return a big string made of count occurrences of the word, separated by the separator string.

 

Example:
input: Word
input: X
input: 3
output: WordXWordXWord
 
Example:
input: This
input: And
input: 2
output: ThisAndThis
 
Example:
input: This
input: And
input: 1
output: This
 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter word");
		String word = scan.next();
		
		
		System.out.println("Please enter seperator");
		String separator = scan.next();
		
		
		System.out.println("Please enter count");
		int count = scan.nextInt( );
		
		String real="";
		for(int i=0;i<count;i++) {
			real+=word;
			real+=separator;
			if(i==count-1) {
				real+=word;
				
			}
			
		}System.out.println(real);
		

	}
}
