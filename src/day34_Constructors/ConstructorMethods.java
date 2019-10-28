package day34_Constructors;

public class ConstructorMethods {

	/*
	  every single class must have a constructor, if we did not give the constructor, then the complier 
	 will give the default(no arg)
	 
	 default constructor:
	 		acces modifier className(){
	 
	 }
	 
	 constructor with argument:
	 		acces modifier className(parameter){
	 
	 }
	 
	 constructor can not have return type and specifier
	 constructor name Must be same with the class name
	 
	 constructor execution depens on the creation of the object
	 
	 
	 constructor calls:
	 		only a constructor can call another constructor
	 
	 
	 create an object from a class:
	 		className referenceName= new existingConstructor
	 */
	public ConstructorMethods() {
		
		System.out.println("Default constructor");
		System.out.println("Hello word");
		
		// no return type
	}
	
	public ConstructorMethods(int num) {
		System.out.println("Hello world panpaaaa");
		System.out.println("I am cons kankaaa "+num);
	}
	
	public static void method1() {
		ConstructorMethods obj=new ConstructorMethods(4);
	}
	
	public static void main(String[] args) {
		//Constructor obj=new Constructor();
		
		ConstructorMethods obj=new ConstructorMethods(2);
		method1();
	}
}
