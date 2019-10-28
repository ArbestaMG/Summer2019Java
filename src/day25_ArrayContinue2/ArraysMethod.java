package day25_ArrayContinue2;

import java.util.Arrays;

public class ArraysMethod {
public static void main(String[] args) {
	
	int num1=10;
	System.out.println(num1);
	
	int[] arr= {1,2,3};
	System.out.println(arr);
	/*
	 to print entire array as a whole, we need to convert array to the String
	 
	 Arrays.toString(VariableName): used for converting single dimensional arrays to String value
	 
	 Arrays class:is presented in java.util package
	 */

	String str=Arrays.toString(arr);
	System.out.println(str);
	
	
	String[] names= {"Elvan","Bibi","Turan"};
	System.out.println(names[0]);
	
	String str1=Arrays.toString(names);
	System.out.println(str1);
	
	/*
	 Arrays.sort(variableName):
	 			sorts the values of the array in acsending orger(SMALLEST TO LARGEST)
	 */
	
	int[] number= {9,4,1,4444,2,432,4,99};
	System.out.println(Arrays.toString(number));// burada stringe cevirdik
	
	Arrays.sort(number);// burada initizalize yapmadik. AMA yinede Array is IMMUTUABLE
	
	System.out.println(Arrays.toString(number));
	
	System.out.println("Maximum number is "+ number[number.length-1]);
	
	String[]Names= {"Zhan","Lyon","Riza","Kellog"};
		Arrays.sort(Names);// alfabetik olarak siraladik
		System.out.println(Arrays.toString(Names)); //Stringe cevirdik
		
	char[] ch= {'6','7','4','9'};// numaralari siraliyor
	Arrays.sort(ch);
	System.out.println(Arrays.toString(ch));
	
	
	int[] arr1= {3,4,1,55,6,11111,678645,33,9,-6,-99};
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
	System.out.println("Minimum number is "+arr1[0]);
	System.out.println("Maximum number is "+arr1[arr1.length-1]);
	
	
	
	int[] arr2= {44,43,1,3,-5,33333,6554};
	Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr2));// buyukten kucuge yazdik
	
	String result="[";
	for(int i=arr2.length-1;i>=0;i--) {// buyukten kucuge yazmaya calisiyoruz
		
		result+=arr2[i]+", ";}// burada [ ekledik
		
	System.out.println();
	
	
	result=result.trim().substring(0,result.length()-2)+"]"; // burada sondaki boslugu sildik, virgulu sildik
	//																			ve ] ekledik
	
	System.out.println(result);
	
	//2. METHODDDDD
	int[] arr3= {44,33,4422,-4,-421,22321312};
	Arrays.sort(arr3);
	int[] arr4=new int[arr3.length];
	
	int z=0;
	for(int i=arr3.length-1;i>=0;i--) {
		arr4[z]=arr3[i];
		z++;}
	System.out.println("Ascending order "+Arrays.toString(arr2));
	System.out.println("Descending order "+Arrays.toString(arr4));
	
	
	
}
}