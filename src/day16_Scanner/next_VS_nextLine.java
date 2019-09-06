package day16_Scanner;
import java.util.Scanner;
public class next_VS_nextLine {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//hele hele
		System.out.println("vay");
		System.out.println("your first name");
		String str1=scan.nextLine();// nextLine yaparsak araya bosluik koyabiliriz
		
		System.out.println("your last name");// burada next methodu tek karakter veya kelime aliyor.araya
		String str2=scan.next();			// bosluk girince bozuluyor
		
		System.out.println("first name is "+ str1);
		System.out.println("last name is "+str2);
	}

}
