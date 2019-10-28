package day26_ForEach;

import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
	/*
	 syntax: 
	 for(DataType each: ArrayName){
	 			}
	 			
	 	variable name "each" represents each value of the array
	 	
	 	number of times execution of the loop depens on the length of the array
	 	
	 	
	 */
	
	int[] arr= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);}

	System.out.println("===========");
	for(int each: arr) {
		System.out.print(each);}
	
	System.out.println("=======");
	
	String []str1= {"A","B","C"};
	for(String each:str1) {
		System.out.println(each);}
	
	/*
	 We use this method when we dont need to create the index variables 
	 */
	
	char[] ch= {'z','x','a','t','w'};
	Arrays.sort(ch);
	
	for(char each:ch) {
		System.out.println(each);
	}

	
	int[] arr1= {1,2,3,4,5,6,7,8};
	for(int each:arr1) {
		if(each%2==0) {
			System.out.println(each);
		}
	}
	
}
}
