package optional_Practices;



public class Methods_Review {
/*
 Methods are the functions that we use in Java. We can assign some variables in them.
 We will study on 2 method types.(Return types)
 1)Return
 2)Void
 
 access-modifier specifier return-type name(){}
  		 access modifiers:public,protected,default,private
		 specifiers:static,abstract,final
		 return-type:void and any other data types(int,double)
		 
		 for now we will only use public and static for the access modifiers and specifiers
		 
  if the return-type is void, the method does not return any value
  if the retun-Type is not void: the method MUST return a value
 */
	//VOID METHOD
	public static void main(String[] args) {
		sayHi();
		even1to20();
		
		saySomething("where are you?");
		oddOrEven(5);
		sumOf2(2500, 753413400);
		
		name();// WE need to ASSIGN that return method
		String assignName=name(); System.out.println(assignName);
		result();
		System.out.println(result());// Instead of  ASSIGNING,we can sout
		
		totaly(10, 20);
		 String[] names = {"Jacki","Melo","Aila","Melisa","Matt","Gregory"};
		 String longname = Lognest(names);
		 System.out.println(longname);
		
		
	}
	//VOID WITH NO ARGUMENTS
	public static void sayHi() {
		System.out.println("Hi everyone");
	}
	
	public static void even1to20() {
		
		for(int i=0;i<20;i++) {
			if(i%2!=0) {
				continue;}
			System.out.print(i+" ");
		}
		
	
		
	
}
	//VOID WITH ARGUMENTS
	public static void saySomething(String str) {
		System.out.println();
		System.out.println("I am telling you: "+str);}
	
	public static void sumOf2(int a,int b) {
			System.out.println(a+b);}
	public static void oddOrEven(int a) {
		if(a % 2==0) {
			System.out.println(a+" is even");
		}
		else {System.out.println(a+" is odd");
	}}
		
	/*
	 RETURN
		 Return method:
            1. does not have "void" as return Type
            2. MUSt return a Value
            3. the returning value MUST match with the return-Type of the method
            4. the method body Must be closed with return statement	
            
            access-modifier    specifier		return-type   name(parameter){
            return (return type data);}
	 */
	//RETURN WITH NO ARGUMENTS
	public static String name() {
		return "First return method";
	}
	public static boolean result() {

		return 8>9;// veya true false de yazabiliyirz
		
	}
	//RETURN WITH ARGUMENTS
	 public static int totaly(int a, int b) {
	       return(a+b);
	    }
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
/*
 Additional Info:
return statement: it's used for exiting the method,we can also use return statement to retun a vlue from the method


continue statement: skips the current iteration of the loop


break statement: exits from  loop or switch statement


System.exit(0): java stops all the execution, entire system

 */

}
