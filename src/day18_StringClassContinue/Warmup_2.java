package day18_StringClassContinue;
import java.util.Scanner;
public class Warmup_2 {
	/*
	 enter your first name and last name
	 muhTAr
	 CyBerteK
	 
	 output: Muhtar Cybertek
	 
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("First name");
		String str1=scan.nextLine();
		
		System.out.println("Last name");
		String str2=scan.nextLine();
		
		str1=str1.substring(0,1).toUpperCase()+str1.substring(1);// burada 2. subs da ismin geri kalanini
		System.out.println(str1);					// kucuk yapiyoruz. 2. bi sinir koymuyoruz, gerek yok
		
		str2=str2.substring(0,1).toUpperCase()+str2.substring(1);
		System.out.println(str2);
		
		
	}
}
