package day36_Reviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz9 {
	  public static void main(String[] args) {
	        // q1 : 
	    //      ArrayList<Object> list = new ArrayList<Object>();
	        
	        
	        // q3:
	            ArrayList<Integer> list = new ArrayList<Integer>();
	                list.addAll(Arrays.asList(1, 2, 3)); 
	                //              index:    0  1  2
	                
	                    int a = 1;
	                list.remove(a); //[1,3]
	                
	                System.out.println(list);
	                
	        //q4:
	                ArrayList<Integer> list2 = new ArrayList<Integer>();
	                list2.addAll(Arrays.asList(1, 2, 3)); 
	                
	                    Integer A = 1;
	                list2.remove(A);  // [2,3]
	                System.out.println(list2);
	                
	        // q5:
	                String[] arr = {"Rob", "Bran", "Rick", "Bran"};
	            ArrayList<String> names = new ArrayList<>( Arrays.asList(arr) );
	            
	            if(names.remove("Bran")) {  //[Rob, Rick, Bran] ,  true
	                names.remove("John");  // false
	            }
	            
	            
	            System.out.println(names);  // [Rob, Rick, Bran]
	                
	        // q6: 
	            
	                
	                
	                
	                
	                
	                
	                
	    }
	}

