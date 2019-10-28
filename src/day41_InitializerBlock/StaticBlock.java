package day41_InitializerBlock;

public class StaticBlock {
	
	
	public StaticBlock(){
		System.out.println("this is constructor");
	}
public static void main(String[] args) {
	StaticBlock obj1=new StaticBlock();
	StaticBlock obj2=new StaticBlock();
	
	System.out.println("main method");
	
}
static {
	System.out.println("this is static A");// static main methoddan once run oldu
	System.out.println("this is static B");
}
static {
	System.out.println("this is second static block");
}

	/*
	 static initializer block: used for initializing static variables
	 static members: 1:static variable
	 				 2:static methods
	 				 3:static initializer block
	 				 4:inner class(nested class)	
	 				 
	 static variable:decleared in the class, outside any method, with static keyword(class variable)
	 					shared by the class and all the objects of the class
	 instance variable belongs to object
	 
	 statuc method: a method can be called using class name
	 				static method belongs to the class
	 
	 
	 static initizalizer block: used for initializing static variable
	 
	 		static{
	 				statements;
	 				}
	 */

}
