
package day25_ArrayContinue2;

import java.util.Arrays;

public class Multi_Dimensional_Array {
public static void main(String[] args) {
	/*
	 n dimensinal array contains (n-1) dimensional array
	 */
	int[] arr1d= {1,2,3};
	int[][] arr2d= {{1,2,3},{4,5,6}};
	
	
	String[] arr= {"A","B"};
	
	String[][] str2d= { {"a","b"}, {"A","B"} };
	//				      0   1		 1	 1
	//						0			1
	// represents the index number of 1 dimensional array
	
	System.out.println(str2d[0][0]);//a
	System.out.println(str2d[0][1]);//b
	System.out.println(str2d[1][0]);//A
	System.out.println(str2d[1][1]);//B
	
	System.out.println(Arrays.toString(str2d[0])); //a,b
	
	System.out.println(Arrays.toString(str2d[1]));//A,B
	
	//Arrays.deepToString(variableName); converst multi-dimensional arrays to String
	
	System.out.println(Arrays.deepToString(str2d)); // bu cok dimensonalda yariyor
	
	int[][]numbers= { {1,2}, {3,4},{5,6}};
	System.out.println(numbers[2][1]);//6
	
	System.out.println(Arrays.toString(numbers[2]));//5,6
	
	System.out.println(Arrays.deepToString(numbers));// hepsini yazdik
	
	
	//3 dimensional array contains multiple n-1 dimensonal arrays
	
	int [][]arr2D= {{1,2},{3,4}};
	
	int[][][] arr3= {    { {1,2},{3,4}}, {{5,6},{7,8}}     };
	
	System.out.println(arr3 [1][1][1]);// 8
	
	System.out.println(Arrays.toString(arr3[1][0]));//5,6
	
	System.out.println(Arrays.deepToString(arr3[1])); //5,6 7,8
	
	
	
}
}
