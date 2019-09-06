package day16_Scanner;
import java.util.Scanner;

public class nextLine2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Write your zip");
	int int1=scan.nextInt();
	
	scan.nextLine();// bunu buraya koydum, bu  enter komutunu yiyor ve asagi devam etmesini sagliyor
	
	System.out.println("Write your city");
	String str1=scan.nextLine();
	
	System.out.println("zip code: "+ int1);
	System.out.println("city name is: "+str1);
	
	System.out.println("Write phone number");
	int pn= scan.nextInt();
	
	scan.nextLine();
	System.out.println("Write your state");
	String str2=scan.nextLine();
	System.out.println("your state: "+ str2);
	

}
}
