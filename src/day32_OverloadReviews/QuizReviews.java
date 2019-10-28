package day32_OverloadReviews;
import java.util.*;
public class QuizReviews {
	 
    public static void main(String[] args) {
        // q4:
         int[] arr = {30, 20, 10, 5, 0};
         Arrays.sort(arr);  // {0, 5, 10, 20, 30};
         int count = 0;
         
         for(int i = 0; i < arr.length; i ++) {
            
             if(arr[i] == 30) {
                 continue;
             //    count++;
             }
             
             System.out.print(arr[i]+" ");
         }
         
         
         // q5:
         int[] numbers = {1,2,3,4};
            int num =  findMax( numbers );
            
        System.out.println();
            
         // q6:
            for(int i = 5 ; i >= 0 ; i--) {
                
                if( i ==3 ) {
                    break;
                //  System.out.println("Done");
                }
                
                System.out.print(i+" ");
                
                
            }
            
            System.out.println();
            
            int num2 = 5; //0
            
            while( isAvailable(num2) ) {
                    // num2 >  0
                
            //   num2 -- ;   //43210
                 
                System.out.print(--num2); 
                
                // num2 -- ;  //54321
                
            }
            System.out.println();
            
            
            dosum(10.0 ,  20.0);
            Integer a=10, b=20;
            
            dosum(a, b);
            
            byte a1 =10;
            Double a2 = (double)a1;  // auto boxing
            
            
            Integer b1 = 30;
             long b2 = b1;
             /*
              
              wrapper class only accepts their own primitve values
              primitives accepts any value as long as it's within the range
              
              */
             
             Integer c1 = 10;
             Double c2 = (double)c1 ; 
             
            
            
             // 16:
             int data[] = {  2010,  2013,  2014,  2015,  2014 };
             int key = 2014;
             int count2 = 0;
                 for ( int  e :  data ) {
                     
                          if(e == key) {
                              count2++;
                               continue;
                              }
                     }
                 System.out.println ( count2 + " Found ");
    
            
         
        
    }
    
    //q5
    public static int findMax(int[] a ) {
        
        return 1;
    }
    
    //q7
    public static int num (int a, int b) {
        return a+b;
    //  System.out.println("");
    }
    
    
    // q8:
     public static boolean isAvailable( int  num ) {  
                                            // 5
         return  (num-- > 0) ? true : false ;
        //          5  > 0  ?  true : false
     }
    
     
    // q11:
            // dosum(10.0 , 20.0 )  ==> double sum 30.0
            // dosum(10, 20)  ==> int sum  30
     public static void dosum(double x, double y) {
         System.out.println("double sum: "+ (x+y) );
     }
     
     public static void dosum(Integer x, Integer y) {
         System.out.println("Integer sum: "+ (x+y)  );
        
     }
     
     public static void dosum(int x , int y) {
         System.out.println("int sum: "+ (x+y) );
     }
     
     public static void dosum(float x, float y) {
         System.out.println("float sum is "+(x+y));
     }
     
     
     
     
     
     

     
     

}
