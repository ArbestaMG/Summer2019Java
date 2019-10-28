package day21_Dowhile_WhileLoop;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	do {
		
	System.out.println("Enter first number");
	int a=scan.nextInt();
	System.out.println("Enter second number");
	int b=scan.nextInt();
	
	System.out.println("addition is: "+(a+b));
	System.out.println("Do you wanna continue?");
	
	String answer=scan.next();
	if(answer.equalsIgnoreCase("no")) {
		break;
	}
	}while(true);
	
}
}
