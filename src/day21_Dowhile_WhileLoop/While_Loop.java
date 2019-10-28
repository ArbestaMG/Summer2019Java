package day21_Dowhile_WhileLoop;

import java.util.Scanner;

public class While_Loop {
public static void main(String[] args) {
	/*
	 for( initilaztion; condition; iteration){}
	 while loop: 
	 while(condition){         // while loop gets executed as long as the condition is true
	 statement;}            
	 */
	
	
	/*
	 any for loop can be converted
	 initilization;
	 while(condition){
	 statements;
	 iterator
	 }
	 */
	int a=9;
	while(a>8){System.out.println("Hello " + a);
	a--;}
	
	String sentence="i like book,read book, have book";
	int count=0;
	
	while (sentence.contains("book")) {
		count++;
		sentence=sentence.replaceFirst("book","");
	}
	System.out.println(count);
	System.out.println(sentence);
	
	while(true) {
		System.out.println("hello");
		break;
	}
	int i=0;
	while(true) {
		
		i++;
		System.out.println("Hello "+i);
		if(i==5) {
			break;
		}
		
	}
	
	
	/*
	 Find all the even number by WHILE LOOP
	 */
	for (int z=1;z<=100;z++) {
		if(z%2==0) {System.out.println(z);}}

	int num=1;
	while(num<=100) {
		if(num%2==0);{System.out.print(num+" ");
		}
		num++;}
	Scanner scan=new Scanner(System.in);
	System.out.println("Starting number");
	int start=scan.nextInt();
	
	System.out.println("ending number");
	int end=scan.nextInt();
	
	for(int j=start; j<=end;j++) {
		if(j%2==0) {
		System.out.println(j);
	}
	}	
	
	int k=start;
	while(k<=end) {
		if(k%2==0) {
			System.out.println(k+"");}
		k++;
			
		}
	}
	
	
}

