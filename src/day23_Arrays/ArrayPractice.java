package day23_Arrays;

import java.util.Scanner;

public class ArrayPractice {
public static void main(String[] args) {
	
	String[] all= {"ibrahim","zuleyha","elina"};
		all[0]= "maruf";
		
		System.out.println(all.length);//3
		System.out.println(all[0]);// normalde ibrahim olmasina ragmen marufa dondu
		/*
		 Arrays size must be initializad, there are two methods;
		 
		 1.giving values:
		 
		 2.initialize the size only wihtout giving value:
		
		 */
		int[] array=new int[4];// this array can contain 4 values
		System.out.println(array.length);//4 burada sadece size yazdik, array degerlerini yazmadik. o yuzden
		System.out.println(array[0]);//0 // hepsi 0 oluyor
		System.out.println(array[1]);//0
		
		array[1]=100;
		System.out.println(array[1]);//100
		
		array[2]=200;
		System.out.println(array[2]);//200
		
		//array[5]=300;
		//System.out.println(array[5]);// burada hata veriyor cunku arayin size 4 olarak ayarladik
		int[] array2;
		//System.out.println(array2[0]); hata veriyor cunku henuz size belirlemedik
		
		Scanner scan=new Scanner(System.in);
		int[] input=new int[10];// here we can store 10 elements
		
		for(int i=0;i<input.length;i++) {
			System.out.println("Enter a number");
			input[i]=scan.nextInt();	
			}
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");}
		
	
		
}

}
