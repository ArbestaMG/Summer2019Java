package day25_ArrayContinue2;

import java.util.Arrays;

public class Practice_2dArray {
public static void main(String[] args) {
	int[][] arr2d= { {1,2}, {3,4,5,6,7,8},{8,9} };
	
	//length method:
			int length=arr2d.length;
			System.out.println(length);
			
			for(int i=0; i<arr2d.length;i++) {
				System.out.println(Arrays.toString(arr2d[i]));}
				
		for(int i=0; i<arr2d.length;i++) {
		for(int j=0; j<arr2d[i].length;j++) {
		
			System.out.print(arr2d[i][j]+" ");
		}}
		System.out.println();
		
		
		char[][] ch = { {'A','B'},{'C','D'} };
		for (int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++){
				System.out.print(ch[i][j]);
			}
		}
	
	
	
}
}
