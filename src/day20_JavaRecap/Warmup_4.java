package day20_JavaRecap;

import java.util.Scanner;

public class Warmup_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	int min=999999999; // burada en kucugu bulmaya calisiyoruz, o yuzden buna buyuk sayi verdik
	
	for(int i=1;i<=5;i++) {
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		if (num<min) {min=num;}
	}
	System.out.println("Minimum number is: "+min);
	
	
	
	
	
	
	}
}
