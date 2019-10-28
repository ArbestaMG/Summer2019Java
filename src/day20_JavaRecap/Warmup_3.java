package day20_JavaRecap;

import java.util.Scanner;

public class Warmup_3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int max=0;
	
	for(int i=1;i<=3;i++) {
	System.out.println("Enter a number");
	int num=scan.nextInt();
	if(num>max) 
	{max=num;} // burada maksimum numarayi bulmaya calisiyoruz. bu adimi yaparak, numara maxa esitliyoruz.
	}			// eger ki buyuk num gelirse, maxe esit oluyor.
	System.out.println(max);
	
	
	int max1=0;
	
	for(int i=0;i<=5;i++) {
		System.out.println("enter a numberrrr");
		int num1=scan.nextInt();
		if(num1>max1) {
			max1=num1;}
		
	
}System.out.println(max1);
	
	
	
	
	
}}
