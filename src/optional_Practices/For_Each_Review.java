package optional_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class For_Each_Review {
/*
 Q:What is For each loop? Why do we use it?
 A:It a loop method that we use. We don't need to create index variables.It is used for arrays
 
 -We can only go forward.
 -We can not determine an itretator.it will be always incrased by one. we can not make it "i+2;i+5"
 
 Regular for Loop:
 for(int i=0;i<Data.length;i++){
 }
 
 For each Loop:
 for(DataType each: ArrayName){
	 			}
 */
	
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);}

		System.out.println();
		System.out.println("===========");
		
		for(int each1111: arr) {
			System.out.print(each1111);}
		System.out.println();
		System.out.println("============");
		
		char[] ch= {'z','x','a','t','w'};
		Arrays.sort(ch);
		
		for(char each:ch) {
			System.out.print(each);
		}
			System.out.println("============");
		
		int[] arr1= {1,2,3,4,5,6,7,8};
		for(int each:arr1) {
			if(each%2==0) {
				System.out.println(each);
			}
		}
		}
	
	
}
