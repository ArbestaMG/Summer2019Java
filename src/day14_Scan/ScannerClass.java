package day14_Scan; 

import java.util.Scanner;// bu sadece Scanner class impor eder.
import java.util.*; // this imports all the class from Java.util.package, o yuzden yavas olur


public class ScannerClass {
/*
  Its a class that provides the methods to get user inputs
  
  
  Scanner lass presented in package "java.util" package
  
  
  In order to use scanner class, the scanner class must be imported:
  import java.util.Scanner
  
  The import statement must be placed between package and className.
 */
	
	
		
		
		/*
		 Scanner VariableName= new Scaner(System.in);
		 
		 VariableName:can reference an object of the scanner class
		 
		 new Scanner(System.in): creates the object of the scanner class
		 
		 method of scanner class: VariableName.nextByte():
		 								allows user to enter Byte value
		 */
		
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // decleration
		System.out.println("Enter a Byte Value 1");
			byte byteNum= input.nextByte(); // only allows user to enter byte value
		
		System.out.println("We are gonna add");
		System.out.println("You have entered: "+byteNum);
		System.out.println("Enter a Byte Value");
		byte byteNum2=input.nextByte();
		String str= "ac";

		System.out.println("You have entered: "+byteNum2+" ve benim karnim "+str);
		
		System.out.println("Addition is:" +byteNum +byteNum2 );
	}
	
}
