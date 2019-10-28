package day29_ReturnMethod;

import java.util.Arrays;

public class ReturnMethodPractice {
	public static void main(String[] args) {
        sum(10,20);
        
        //int max = sum(10,20);  // the method sum does not return any value
        
        additiion(10,20); // this method is an int value
        
        System.out.println(  additiion(10,20)  );
        
        float num = additiion(10,20);
        
        System.out.println( num );
        
        
        
        int max = (int) greaterNumber(90, 200, 30);  
        // it's gonna be reusable if we assign to a variable
        
        System.out.println(max);
        
        System.out.println( greaterNumber(90, 200, 30)  );
        
        int[] arr = {20, 30, 1, 2, 3, 5, 9};
        int maxNum = maximum(arr);
        System.out.println(maxNum);
        
        
        int[] arr2 = {10000, 90000, 823112, 762112, 654312};
        int maxNum2 = maximum( arr2 );
        System.out.println(maxNum2);
        
        
    String[] names = { "emrah", "zulfie", "waris", "mehmet", "Aktoty", "yusuf", "Djalolitdin", "Munevver", "Hatice"};
    
    String longname = Lognest(names);
    System.out.println(longname);
    
    System.out.println( Lognest(names) );
    
    
    
        int[] array = {1,2,3,4,5,6,7};  // 7 6 5 4 3 2 1
            array = Sort(array);// sort asagina tanittigimiz sey
            System.out.println( Arrays.toString(array) );
            
            
        
    }
    
// write a method that accepts an int array and retuns the maximum number from the array
    
    public static int maximum( int[] arr ) {
        
        Arrays.sort(arr);
        
        return arr[arr.length-1];
    }
    
    
    
    
    
    
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    
    public static int additiion(int a, int b) {
        return a+b;
    }
    // write ba method that accepts 3 numbers and returns the largest number
    
    public static double greaterNumber(int a, int b, int c) {
        int[] arr = { a, b, c };
        //          {1 ,2 ,3};
        Arrays.sort(arr);
        
        return arr[arr.length-1];
    }
    
    
    //1. write a method that accepts String array, and returns the longest String value form the array
    public static String  Lognest(String[] arr) {
        
        String longWord ="";
        
        int max=0;
        for(int i=0; i < arr.length; i++) {
            if( arr[i].length()>max ) {
                max = arr[i].length();
                longWord = arr[i];
            }
        }
         return longWord;
    }
    
    
    // write a method that accepts an int array and sorts it then retuns an array
    
    public static int[] Sort(int[] arr) {
                                //[5,3,2,22,3};
        Arrays.sort(arr);  //[2,3,3,5,22];
        int[] numbers = new int[arr.length]; // numbers array has same length with the arr
        
        int z =0;
        for(int i = arr.length-1; i >= 0; i--  ) {
                     numbers[z]= arr[i];
                     z++;
        }
        
        return numbers;
    }
    
    
    
}