package day18_StringClassContinue;
import java.util.Scanner;
public class Warmup {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("First name");
		String str1=scan.nextLine();
		
		System.out.println("Last name");
		String str2=scan.nextLine();
		
		String str3=str1+str2;
		System.out.println(str3);
		
		char ch1=str1.charAt(0);
		
		char ch2=str2.charAt(0);
		System.out.println(ch1+","+ch2); // char metodu ile isimlerin bas harflerini yazmak
		
		
		String initials=str1.substring(0,1).concat(".")+str2.substring(0,1);
		System.out.println(initials);// substring methodu ile yazmak
		
		
		String lastletters=""+str1.charAt(str1.length()-1)+","+str2.charAt(str2.length()-1);
		System.out.println(lastletters);// son harfleri buluyoruz
		
		lastletters=lastletters.toLowerCase();
		System.out.println(lastletters);// son harfleri kucuk yaptik
		
		
				
				
	}
}
