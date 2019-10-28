package replits;

import java.util.Scanner;

public class HW91 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	 String str = scan.nextLine();
	 
	 int n=0;
	 for(int i=0;i<str.length()-1;i++) {
		 if(str.substring(i,i+2).equals("hi")) {
			 n++;}
		 }System.out.println(n);
	
	 
	/*
	
	
		for(int i =0; i<str.length()-1;i++) {// Cybertek
			if(str.substring(i,i+2).equals("hi")) {ntimes++;}
			
		}
		System.out.println(ntimes);

		 */
			
	 
	 
}}
