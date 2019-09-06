package day15_Scanner_StringClass;
import java.util.Scanner;

public class Task01 {
	
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number");
	int intNum=input.nextInt();
	
	System.out.println("Enter second number");
	int intNum2=input.nextInt();
	
	System.out.println("Your total is: " +(intNum+intNum2));
	
	
	
	float f1=(156_00.0>146_000.00)?15:10;
	System.out.println(f1);
}
}
