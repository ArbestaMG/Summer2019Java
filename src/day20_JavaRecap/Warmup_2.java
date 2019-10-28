package day20_JavaRecap;

import java.util.Scanner;

public class Warmup_2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int sum=0;
	
	for(int i=1; i<=3;i++) {
	System.out.println("Enter a number");
	int num=scan.nextInt();// burada 10 kere numara girmemizi sagladik
	sum +=num; // numaralari suma ekliyoruz
	} 
	System.out.println("Sum is: "+sum);
	
	
	
	int sum1=0;
	for(int i=0; i<10;i++) {
	System.out.println("Enter a number");
	int num1=scan.nextInt();
	sum1+=num1;

	}System.out.println(sum1);
	
}
}
