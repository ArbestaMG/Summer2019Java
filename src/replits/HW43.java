package replits;
import java.util.Scanner;

public class HW43 {
public static void main(String[] args) {
	
	Scanner object=new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1=object.nextInt();
	
	System.out.println("Enter second number");
	int num2=object.nextInt();
	
	System.out.println("Enter third number");
	
	int num3=object.nextInt();
	
	
	if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
        System.out.print("Medium value is: "+num1);
    }
    //checking num2 is a middle number or not
    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
        System.out.print("Medium value is: "+num2);
    }
    //checking num3 is a middle number or not
    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
        System.out.print("Medium value is: "+num3);}
	
			
			
			
}
}
