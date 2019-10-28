package day23_Arrays;

public class Warmup2 {
public static void main(String[] args) {
	 /*
    2. write a program that can find the unique characters from a String.
       Ex: 
           input:
               AAABCDEEFF
           output:
               BCD
    
    */
               
               String str ="ALL THE LETTERS";
               String Unique ="";
               
               
       for(int j = 0 ; j < str.length(); j++) {
           
               int count =0;
               
               for(int i = 0; i < str.length(); i++) {
                   if(str.substring(i, i+1).equals( ""+str.charAt(j) )) {
                       count++;
                   }
                   
               }               
               if(count == 1) {
                   Unique+=""+str.charAt(j);
               }
               
       }
               System.out.println("Unique characters are: "+Unique);
               
           	for(int i=0;i<=4;) {
    			i++;
    			System.out.println(i);
    		}
           	
           	int z=5;
           	for(int i=5;i>0;i--) {
           		z+=i;
           		System.out.println(z);	}
}
}
