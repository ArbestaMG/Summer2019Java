package day15_Scanner_StringClass;

import java.util.Scanner;

public class String_input {
/*
 next vs nextLine();
 
 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname=scan.next(); // burada nextLine yaparsak isim soy isim kisminda coktan fazla yazabiliriz.
		
		System.out.println("Enter your last name");
		String lastname=scan.next();
		
		System.out.println("first name is: "+firstname);
		System.out.println("last name is: "+lastname);
		
	}
}
