package day10_IfStatement;

public class Nested_if {
	/*
	 Nested_if:
	 if(condition1){
	 	if(condition2){
	 	}
	 	}
	 */
public static void main(String[] args) {
	if(true) {
		System.out.println("1. level"); // aralarina {} koymuyoruz , boylece 2.kod 1. koda bagli sekilde calisiyor.
		if(false) {
			System.out.println("Hello world");  } // her ikiside true olursa kod calisir
		else {System.out.println("Last");}
		}
	
	
	/*
	 60<grade       F
	 60<=grade<70   D
	 70<=grade<80   C
	 80<=grade<90   B
	 90<=grade<=100 A
	 
	 
	 */
	int grade = 0;
    
    if( grade >= 60 && grade <= 100) {
        System.out.println("you passed");
        
        if( grade >=90 && grade <= 100) {
            System.out.println("\twith a grade of A");
            
        } 
        else if(grade >=80 && grade < 90) {
            System.out.println("\twith a grade of B");
        }
        else if(grade >= 70 && grade < 80) {
            System.out.println("\twith a grade of C");
        }
        else {  // 60 <= grade < 70
            System.out.println("\t with a grade of D");
        }
        
    }
    else {  // either less than 60 or greater than 100
        
        if(grade < 60) {
            System.out.println("You failed with a grade of F");
        }
        else { // greater than 100
            System.out.println("Invalid score, error 404");}
    } 
    

    int number=11;
    
    if (0<number && number<=100){
    System.out.println("YES");
    
    if(0<number && number<=25){System.out.println("0-25");}
    
    	else if(25<number && number<=50) {System.out.println("25-50");}
    
    	else if (50<number && number<=75)
    	{System.out.println("50-75");}
    	else {
    	System.out.println("75-100");}
    
    
    
    	}	 else {System.out.println("NO");}
}}






        
		
	
            
    



		
		


