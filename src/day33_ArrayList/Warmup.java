package day33_ArrayList;

import java.util.Arrays;

public class Warmup {
	 /*
    Warm up:
   write a return method that accepts an int array and sorts it in descending order
   write a return method that accepts a double array and sorts it in descending order
   write a return method that accepts a char array and sorts it in descending order
   write a return method that accepts a String array and sorts it in descending order
       Hint: method overloading is prefered here
    */
   
   public static void main(String[] args) {
       
       int[] arr = {10,89,20,300,10,900, 0, 1};
       
           arr =   SortDe(arr);
           
           System.out.println( Arrays.toString( arr ) );
           
       double[] arr2 = { 10.5, 5.5, 300, 2.0, 6.5};    
           
           // arr2 = SortDe( arr2 );
           System.out.println(   Arrays.toString(  SortDe( arr2 ) ) );
       
           
       char[] ch = {'c','a', 'b', 'z', 'x', 'k'};
       
           ch = SortDe(ch);
           
           System.out.println(Arrays.toString(ch));
           
       String[] names = {"Mikray", "Jin", "Minever", "Nurzat", "Viktoria", "Erhan" };
       
       names = SortDe(names);
       
       System.out.println(Arrays.toString(names));
       
       
       
   }
   
   
   public static int[] SortDe(int[] arr) {
       
       Arrays.sort(arr);  // ascending order
       int[] arr2 = new  int[arr.length];   // can contain all values of arr
       int j=0;
       
       for(int i = arr.length-1;  i >= 0 ; i-- ) {
               arr2[j] = arr[i];
           //  arr2[arr.length-1-i] = arr[i];
                   j++;
       }
       
       return arr2;
   }
   
   
   public static double[] SortDe(double[] arr) {
       Arrays.sort(arr);  // ascending order
       double[] arr2 = new  double[arr.length];   // can contain all values of arr
       int j=0;
       
       for(int i = arr.length-1;  i >= 0 ; i-- ) {
               arr2[j] = arr[i];
           //  arr2[arr.length-1-i] = arr[i];
                   j++;
       }
       
       return arr2;
   }
   
   
   public static char[] SortDe(char[] arr) {
       Arrays.sort(arr);  // ascending order
       char[] arr2 = new  char[arr.length];   // can contain all values of arr
       int j=0;
       
       for(int i = arr.length-1;  i >= 0 ; i-- ) {
               arr2[j] = arr[i];
           //  arr2[arr.length-1-i] = arr[i];
                   j++;
       }
       
       return arr2;
   }
   
   
   public static String[] SortDe(String[] arr) {
       Arrays.sort(arr);  // ascending order
       String[] arr2 = new  String[arr.length];   // can contain all values of arr
       int j=0;
       
       for(int i = arr.length-1;  i >= 0 ; i-- ) {
               arr2[j] = arr[i];
           //  arr2[arr.length-1-i] = arr[i];
                   j++;
       }
       
       return arr2;
   }
   
   
   public static Integer[] SortDe(Integer[] arr) {
       Arrays.sort(arr);  // ascending order
       Integer[] arr2 = new  Integer[arr.length];   // can contain all values of arr
       int j=0;
       
       for(int i = arr.length-1;  i >= 0 ; i-- ) {
               arr2[j] = arr[i];
           //  arr2[arr.length-1-i] = arr[i];
                   j++;
       }
       
       return arr2;
   }
   
   
   
   
   
   
   
}



