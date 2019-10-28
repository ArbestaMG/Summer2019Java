package day27_CustomMethods;

import java.util.Arrays;

public class Warmup1 {
public static void main(String[] args) {
	// Cift sayilari yaziyoruz
	int [] numbers=new int[100];
	
	for(int i =1; i<100;i++) {
		numbers[i-1]=i;
		
	}System.out.println(Arrays.toString(numbers));
	for(int each:numbers) {
		if(each%2!=0) {
			continue;
		}
		System.out.print(each+" ");
	}
}
}
