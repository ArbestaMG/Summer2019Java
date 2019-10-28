package day24_ArraysContinue;

import java.util.Scanner;

public class ArraysPractice {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	int [] number=new int [5]; // 10 hafizali array icin yazdik


	for(int i=0;i<number.length;i++) {
		
		System.out.println("Please write a numbers");
				number[i]=scan.nextInt();}
	int sum=0;
	for(int i=0;i<number.length;i++) {
		System.out.println(number[i]+" ");
		sum+=number[i];}
	System.out.println(sum);
	System.out.println("==================");
	/*
	 5 names and return the longest name
	 */
	
	String [] name= {"Seyfo","Asiya","Mira","Me","Kateaaarin a"};
	int max=0;
	String longestname="";
	for(int i=0;i<name.length;i++) {
		if(name[i].length()>max) {
			max=name[i].length();
			longestname=name[i];
			}
		
	}System.out.println(max);
	System.out.println(longestname);
		
	}
}
