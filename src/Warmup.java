package day17_StringClass;
import java.util.Scanner;

public class Warmup {
public static void main(String[] args) {
	
	Scanner object=new Scanner(System.in);
	
	System.out.println("Please enter your first name");
	String str1=object.nextLine();
	System.out.println("Last name");
	String str2=object.nextLine();
	String str3=str1.concat(" "+str2); // in concat onlu String variable
	System.out.println(str3);
	
	System.out.println("your full name has "+str3.length()+" chars");
	int lastindexnum=str3.length()-1;// burada en sondaki harfi buluyoruz
	System.out.println(str3.charAt(lastindexnum));
	
}
}
