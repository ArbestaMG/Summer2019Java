package day10_IfStatement;

public class IfStatement_WithoutCurlyBrace {
public static void main(String[] args) {
	/*
	 single if statement:
	 if(condition) // only a single line of statement
	  
	 */
	if(false) {
		System.out.println("today is friyay");
		System.out.println("tomorrow is holiday");
		System.out.println("there is no class tomorrow");}
	
	if(false)
		System.out.println("hello");
		System.out.println("brother");
		/*
		 if (condition) // single line of statement
		 else // single line of statement  // else if ten hemen sonra konur.
		 */
		
		if(true)System.out.println("Noo");
		else
			System.out.println("What");
		
		if (true)
			System.out.println("if block");
		else if(true)
			System.out.println("else if block"); // else if yazabilmek icin if yazmamiz lazim.   if -- else if arasina bisey yazilamaz.
		else 
			System.out.println("else block");   //
		
		/*
        single if statement:
           if( condition ) 
                   // single line of statement only
        
        */
       
       
       if(false) {
           System.out.println("Today is friday");
           System.out.println("Tomorrow is day off");
           System.out.println("there is no java class tomorrow");
       }
       
       
       if(false)
           System.out.println("Today is Friday");
   
       
       if(false) 
           System.out.println("Hello");
       
       
       
       /*
           if- else statement:
               
               if(condition)
                       // single line of statement
                else
                   //  single line of statement
        */
           
       if(true) {
           System.out.println("Hello");
       }
        System.out.println("Good morning");
       //else {
       //  System.out.println("Hola");
   //  }   // else statement MUST be declared right after the if statement
       
       
       if(false)
           System.out.println("this is if"); 
       
       else 
           System.out.println("this is else");
       
       
       /*
        multi-branch if statement:
               
               if( condition1 )
                       // single line of statement
               
               else if( condition2 )
                       // single line of statement
                        
               else 
                       // single line of statement
        
        */
       
       
       if(true)
           System.out.println("if block");
   //  System.out.println("Hello");
       else if(true)
           System.out.println("else-if block");
   //  System.out.println("hola");
       else
           System.out.println("else block");
       
       // else block is not mandatory
}
}
