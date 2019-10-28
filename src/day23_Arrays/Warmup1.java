package day23_Arrays;

import java.util.Scanner;
//Write a program that divide two numbers without using division operator
public class Warmup1 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
	
	int a=10;
	int b=3;
	System.out.println((a/b));// 3

	
	
	int x=20;
	int y=7;
	int count=0;
	while(x>=y) {
		x-=y;
		count++;
	}System.out.println(count);//6
	System.out.println(x);// 2 // kalan
	
	
	
	for(int i=0;i>0;i++) {
		x-=y; count=++count;
		
	}System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("======");
	
	int num1=150;
	int num2=20;
	int repeat=0;
	int num3=num1/num2;
	for(int i=0;i<num3;i++) {
		if(num1>=num2) {
			num1=(num1-num2);
			repeat++;
		}
	}System.out.println(repeat);
}
}
