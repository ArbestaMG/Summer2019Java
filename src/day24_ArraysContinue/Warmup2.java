package day24_ArraysContinue;

public class Warmup2 {
public static void main(String[] args) {
	/*
	  3. write a program that return the minimum value from an int array
      4. write a program that return the second minimum valye from an int array
    */
	
	int arr[]= {100,3,44,55,33,4,2};
	
	int min=9999999;
	
	for(int i=0; i<arr.length;i++) {
		if(arr[i]<min) { 
			min=arr[i];}
	}System.out.println(min);
	
	int secondmin=999999;
	for(int j=0;j<arr.length;j++) {
		if(arr[j]<secondmin && arr[j]!=min) {
			secondmin=arr[j];
		}
	}System.out.println(secondmin);
	
	
}
}
