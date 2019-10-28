package day28_ArraysRecap;

import java.util.Arrays;

public class ArraysReview {
/*
 single dimensional array:
 */
	public static void main(String[] args) {
		int[] arr1d= {1,2,3,4,5};
		// index numb:0,1,2,3,4
		System.out.println(arr1d[2]);
		int []arrays1d=new int[5]; // burada sadece rangesini belirledik
		System.out.println(Arrays.toString(arrays1d));// degerini vermedigimiz icin hepsi 0 verdi
		System.out.println(Arrays.toString(arr1d));
		arrays1d[0]=1;
		arrays1d[1]=44;
		arrays1d[2]=21;
		//arrays1d[3]=4314; // bunu verirsek index out of range oluyor, o yuzden olmaz.
		
		int[] num= {1,2,3,4,5,6};
		for(int each:num) {
			if(each==3) {
				continue;// 3 olunca yazmaz, devam eder
			}
			System.out.print(each+" ");
			/// break;  buraya break koyarsak drek 1 verir,looptan hemen cikar
		}
		System.out.println();
		System.out.println("====");
		int [] number= {100,200,300,400};
		
		for(int i=0;i<number.length;i++) {
			// System.out.println(number[i]+" ");  buraya koyarsak 100 200 300 verir
			if(number[i]==300) {
				break;}
			System.out.println(number[i]+" ");//buraya koyarsak 100 200
		}
		
			/*
			  Arrays methodlari: toString(), sort(),deepToString()
			toString(): converting single dimensional array to String
			sort(): kucukten buyuge siralar
			deepToString(): convertin multi dimensional arrays to String
			 
			 */
		
		
		long[] Larr= {20,440,10,90};
	
		System.out.println(Arrays.toString(Larr));
		Arrays.sort(Larr);
		System.out.println(Arrays.toString(Larr));// siralama sonrasi
		
		//deepToString()
		
		int[][]arr2d= { {1,2}, {3,4} };
		System.out.println(Arrays.deepToString(arr2d));
		
		System.out.println(Arrays.toString(arr2d[1]));// burada sadece 3,4 yazdirdik
		System.out.println(arr2d[1][1]);
		
		int[][] AR2d= { {11,12}, {13,14} };
		
		for(int [] each1:AR2d) {
			System.out.println(Arrays.toString(each1));}
		
		int[][]ARR= { {20,30}, {40,50} };
		for(int[] arrayss:ARR) {
			for(int ARAYASO:arrayss) {
				System.out.println(ARAYASO);
			}
		}
	}
}
