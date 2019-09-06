package day15_Scanner_StringClass;

import java.util.Scanner; // imports scanner class only
//import java.util.*; //imports all the classes from java.util(wild import)
/*
 package name: java.util
 class name: Scanner   
 import statement must be placed between class and package
  wild import: imports all the classes within "java.util" package
  
  
  Decleration of scanner class:
  	Scanner variableName= new Scanner(System.in)
  
  	variableName:can reference an object of scanner class
  	
  	new Scanner(System.in): creates an object from the scanner class
 */
public class ScannerClass {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
	
		System.out.println("Enter byte value");
		byte num1=input.nextByte(); // returns the user input  as a value
		
		System.out.println("Enter short value");
		short num2=input.nextShort();
		
		System.out.println("Enter int value");
		int num3=input.nextInt();
		
		System.out.println("Enter long value");
		long num4=input.nextLong();
		
		System.out.println("Enter boolean");
		boolean result = input.nextBoolean();
		
		System.out.println("Enter a float");
		float num5=input.nextFloat();
		
		System.out.println("Enter a double");
		double num6=input.nextDouble();
	
		
		
		
		
		/*
		 Scanner methods:
		 variableName.nextByte():
		 variableName.nextShort():
		 variableName.nextInt():
		 variableName.nextLong():
		 variableName.nextBoolean():
		 variableName.nextFloat
		 variableName.nextDouble
		 */
		
	}

}
