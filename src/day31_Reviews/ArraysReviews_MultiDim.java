package day31_Reviews;

import java.util.Arrays;

public class ArraysReviews_MultiDim {
	public static void main(String[] args) {
		/*
		 n dimensional array: contains n-1 dimensional arrays
		 */
		
	int []arr1d= {1,2,3};
	//				   0,1,2	
	int [] []arr2d= { {1,2,3} , {4,5,6} };
	//					0			1
	System.out.println(arr2d.length);//2
						
	
	System.out.println(arr2d[0][2]);//3
	
	System.out.println(Arrays.toString(arr2d[1]));//4,5,6
	
	System.out.println(Arrays.deepToString(arr2d));
	
	char[]ch= {'a','b','c','d'};
	
	for(char each:ch) {
		if(each=='c') {
			continue;
		}
		System.out.print(each+" ");
	}System.out.println("===========");

	String[][]names= { {"ali","mamo","jedi"},{"veli","maykil","lexi"} };
	
	for(String[]each1d:names) {
		for(String eachvalue:each1d) {
			
			if(eachvalue.equals("jedi")) {
				continue;
			}
		System.out.print(eachvalue+" ");
	}}

	}
}
