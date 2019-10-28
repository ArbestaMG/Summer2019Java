package day29_ReturnMethod;

import java.util.Arrays;

public class MethodOverLoading {
// overloading: same method name , different parameters
	public static void main(String[] args) {
		int result=sum(10, 20);
		System.out.println(result);
		
		System.out.println(sum(10,20,30));
	    
		int []descending= {11,33,53,4313};
		Sort(descending);
		System.out.println(Arrays.toString(descending));
		
		sumof(100,300);// konu disi
		
	}
	
	public static void sumof(int a,int b) {
		System.out.println(a+b);// bu konu disi, asagiya bak
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	/*
	- overload method example: the sort method of Arrays class, it accepts all data types
	-methods must have different parameters to overload
	 -everything can be overloaded
	*/
	
	public static void Sort(int[]arr) {
		Arrays.sort(arr);
		int[]arrays=new int[arr.length];
		int z=0;
		for(int i=arr.length-1;i>=0;i--) {
			arrays[z]=arr[i];
			z++;
		}System.out.println(Arrays.toString(arrays));
	}
	
}
