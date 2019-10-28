package day22_NestedLoop;

import java.util.Scanner;
/*
 ODEV: calculator program
 		write program that asks user if he wants to : *,/,%,+
 		
 		then ask user two number
 		
 		then return the result the console
 		
 		ask then if he wanna continue for another math
 		if yes==> repeat the previos steps
 		if no ==> exit the system
 		other wise,any enter except yes or no, ask to user to re enter
 		
 */
public class NestedLoopTask2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	while(true) {
	System.out.println("Enter two numbers");
	
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	System.out.println("Multiplication is: "+(a*b));
	System.out.println("Do you want to continue?");
		
	scan.nextLine();
	String answer=scan.nextLine().toLowerCase();
	
		while(!(answer.equals("yes")||answer.equals("no"))) {
		System.out.println("Please make up your mind");	
		System.out.println("Do you wanna keep");
		answer=scan.nextLine();
		}
	if(answer.equals("no")) {
		break;
	}
	
	}
}
}
