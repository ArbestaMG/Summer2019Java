package replits;
import java.util.Scanner;

public class HW57 {
	 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter full name");
	 String str1=scan.nextLine();
	 if(str1.equalsIgnoreCase("Max Payne")|| str1.equalsIgnoreCase("Alan Wake")) {
		 System.out.println("User found!");}
	 else {System.out.println( "User not found!");}
	 
	 
	 }
}
