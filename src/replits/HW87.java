package replits;

import java.util.Scanner;

public class HW87 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 String word = scan.next();
	 
	 
	 if(word.length()<4) {System.out.println("false");}
	 else {
	 
		 if(word.substring(0,4).equals("java")) {System.out.println("true");}
		 else if(word.substring(1,5).equals("java")){ System.out.println("true");}
		 else {System.out.println("false");}
	 }}
}

