package day31_Reviews;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReviews2 {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	int[]arr=new int[3];
	
	System.out.println("Enter a number");
	arr[0]=scan.nextInt();
	System.out.println("Enter a number");;
	arr[1]=scan.nextInt();
	System.out.println("Enter a number");
	arr[2]=scan.nextInt();
	
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("min value is "+arr[0]);
	System.out.println("max values is "+arr[arr.length-1]);
	
	
	System.out.println("=================");
	
	System.out.println("How many number you wanna babe???");
	int number=scan.nextInt();
	
	
	int []arrays=new int[number];
	for(int i=0;i<arrays.length;i++) {
		System.out.println("Would you please enter a number?");
		arrays[i]=scan.nextInt();
	}System.out.println(Arrays.toString(arrays));
}
}
