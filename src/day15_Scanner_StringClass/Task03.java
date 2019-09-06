package day15_Scanner_StringClass;

import java.util.Scanner;
public class Task03 {
public static void main(String[] args) {
	/*
	 write program ask users firsy name and last name.
	 */
	
	Scanner input= new Scanner(System.in);
	 System.out.println("First name pls");
	 String first=input.next();
	 
	 System.out.println("Last name pls");
	 String last=input.next();
	 
	 System.out.println("Your full name is: "+ first+" "+last);
	 
	 input.close();// gets rid of warning of the scanner class
	 
}
}
