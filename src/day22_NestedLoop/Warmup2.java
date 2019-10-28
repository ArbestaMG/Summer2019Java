package day22_NestedLoop;
import java.util.Scanner;
public class Warmup2 {
    
    /*
     2. write a program that can check if the String is palindrome. 
     if it's print "true", otherwise print "false"   
                    DO NOT USE FOR LOOP
        Ex: input: level
            output: true,  (because reversed value is still "level")
     */
    public static void main(String[] args) {
        /*
          org            rev
          abba    ==>    abba     ==> palindrome
          level   ==>    level    ==> palindrome
          
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, Enter some thing");
        String original = scan.nextLine();
        
        //      rve index: 6543210
        String Reverse = "";  //"gfedcba"
    /*  // bu da calisiyor. // silersek calisir
        for( int i = original.length()-1 ;   i >= 0  ;     i-- ) {
        //        initialization      ;    condition ;  iterator
            //  Reverse += original.substring(i, i+1);
                Reverse += original.charAt(i);
        }
        
        */
        
        int i = original.length()-1;
        while ( i >= 0 ) {
        //  Reverse += original.substring(i, i+1);
            Reverse += original.charAt(i);      
            i--;
        }
        
        
        boolean result = original.equals(Reverse) ? true : false;
        System.out.println( result );
        
        
        
        
        
    }
}
