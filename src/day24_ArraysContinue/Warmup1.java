package day24_ArraysContinue;

import java.util.Scanner;

public class Warmup1 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	/*
	   1. write a program that can return the maximum value from an int array
       2. write a program that can return the second maximum value from an int array
	 */
	
	int[] arr= {10,20,33,4444,2,1};
		int max=0;
	
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];}
		} System.out.println("max is " +max);
		
		int secondmax=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>secondmax && arr[j]!=max) {
				secondmax=arr[j];
				
					}System.out.println("the second max is "+ j);
		}
	
		
		
		
}
	
	
}

