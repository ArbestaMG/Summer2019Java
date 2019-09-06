package day16_Scanner;
import java.util.Scanner;
public class Warmup {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name and last name");
	String str1=scan.next();
	String str2=scan.next();
	String fullname= (str1+" "+str2).toUpperCase();
	System.out.println(fullname);
	
	
	
}
}
