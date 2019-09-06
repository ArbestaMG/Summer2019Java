package day16_Scanner;

import java.util.Scanner;

public class nextLine {
	
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your phone number");
	int phonenumber=scan.nextInt();
		
		scan.nextLine();//2) bunu koyuyoruz boylece enter komutunu bu aliyor, isim yazabiliyoruz
	System.out.println("Enter your name");
	String name=scan.nextLine();//1)nextLine burada numarayi aldi, ustune birde enter komutunu aldi.Yani rakam+enter
	
	
	
	// EXAMPLE
	System.out.println("Your numba");
	int phone1=scan.nextInt();
	
	System.out.println(phone1);
	scan.nextLine();// bunun amaci sistemi okutmak. yoksa sistem alttakini okumaz
	
	System.out.println("Enter name");
	String name1=scan.nextLine();

}
}
