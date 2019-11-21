package day48_MethodOverRiding;


/*
 Method overloading:
 same name, different parameter
 return type does not matter
 access modifiers does not matter
 
 it can happen in the same class or different classes
 
 Method overriding:
 same name, same parameter
 ////////////////////FARKLARI///////////////////////
 it can not happen in the same class   ////ONE DIFFERENCE
 Method must be override in sub CLASS(inheritance lazim)//
 ONLY instance method can be overrided
 Constructor and static methods can no be ve overrided
 
 why do we need overriding?
 		to implement specific functioanlity to the method.
 		we create methods with same name and same parameters, then provide different implementation
 		
 
Example: 
		Webdriver driver=new ChromeDriver();
		driver.get(URL): goes the URL in chrome browser
 			
 		Webdriver driver=new FireFox();
 		driver.get(URL): goes the URL in firefox browser
 		
 			
 			
 			
 			@Override: used to verify if the used overrided
 */
	
	class student{
		public void printName() {
			System.out.println("Studen HAKAN");
			
			
		}
	}
		
		public class Method_Overriding extends student {
	
			
	public void printName() {
		System.out.println("Method overrding Suko");
	}
	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}

	 public static void main(String[] args) {
		
		 Method_Overriding obj=new Method_Overriding();
		 
		 obj.printName();
		 
		 
		 student obj1=new student();
		 
		 obj1.printName();
	}
}
