package day12_IfStatementContinue;

public class IfStatement_Without_Curly_Braces {
	public static void main(String[] args) {
		 if(true) {
	            System.out.println("Hello");
	            System.out.println("Hello");
	        }else {
	            System.out.println("Wolrd");
	        }
	        
	        
	        // without curly brace: a single line of statement
	        if(true) 
	            System.out.println("Hello");
	    //      System.out.println("Hello");   
	//without culy brace if block cannot hold more than one statement
	        else 
	            System.out.println("World");
	            
	        
	        if(true) {
	            if(true) {
	                System.out.println("Hello World");
	            }
	            else {
	                System.out.println("Hello cybertek");
	            }
	        }
	        else {
	            System.out.println("Invalid");
	        }
	        
	        System.out.println("=====================");
	        // nested if: 
	    
	        if(true)
	            
	            if(true) System.out.println("Hello World");
	        
	            else  System.out.println("Hello cybertek");
	        
	        else System.out.println("Invalid");
	    
	    
	        
	        // multi-branch if:
	        int grade =80;
	        if( grade <= 100 && grade >= 0) {
	            if(grade >= 90) {
	                System.out.println("A");
	            }
	            else if(grade >= 80) {
	                System.out.println("B");
	            } 
	            else if(grade >=70) {
	                System.out.println("C");
	            }
	        }
	        else {
	            System.out.println("Invalid Entry");
	        }
	        
	        
	        
	    if(grade <= 100 && grade >= 0)    
	        if(grade >= 90) 
	            System.out.println("A");      
	        else if (grade >= 80)
	            System.out.println("B");
	        else if (grade >=70) 
	            System.out.println("C");
	        else // this else statement belongs to the "else-if statements
	            System.out.println(); 
	    else  // this else statement belongs to the pre condition
	        System.out.println("Invalid");

	
	}

}
