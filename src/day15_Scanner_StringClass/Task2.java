package day15_Scanner_StringClass;
import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first number");
	double n1=input.nextDouble();
	
	System.out.println("Enter second number");
	double n2=input.nextDouble();
	
	System.out.println("Enter thirt number");
	double n3=input.nextDouble();
	
	double largest=(n1>n2 && n1>n3)? n1
				   :(n2>n1 && n2>n3)?n2
					:n3;

	System.out.println("Largest number is: "+ largest);
	
	
	float num=(1233>1_234)?455:544;
			System.out.println(num);
}
}
