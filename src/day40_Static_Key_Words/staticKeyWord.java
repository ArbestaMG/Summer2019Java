package day40_Static_Key_Words;

public class staticKeyWord {
	
	int a;
	static int b;
/*
 Static means that we can acces the members thorugh the class name.
 Static members belongs to the class also caled class member
 
 
 What can be static in java:
 		1:static variables
 		2:static methods:
 		3:static initializer block
 		4:inner class
 		
 
 instance variables:created in the class outside any methods. 
 They belongs to the object. Each object will have its own copy
 
 local variables:decleared with in the method or blocks only accessible with in methods
 
 static variables:created in the class outside any methods with static keyword
 	when a variable is static, its chared by class and all objects out of the class
 */
	public static void main(String[] args) {
		//System.out.println(staticKeyWord.a);
		staticKeyWord obj1= new staticKeyWord();
		obj1.a=100;
		System.out.println(obj1.a);//100
		
		
		staticKeyWord obj2=new staticKeyWord();
		System.out.println(obj2.a);//0
		obj2.a=200;
		
		System.out.println(obj2.a);// 200
		
		double num=100.5;
		System.out.println(obj1.b);//0
		
		obj1.b=250;
		System.out.println(obj1.b);//250
		System.out.println(obj2.b);//250  bunu cagirabildik cunku static variable
		
		System.out.println("=========");
		
		staticKeyWord obj3=new staticKeyWord();
		obj3.a=100;
		System.out.println(obj3.a);//100 
		
		staticKeyWord obj4=new staticKeyWord();
		System.out.println(obj4.a);
	}
	public static void method1() {
		// System.out.println(num); // bu hata verir cunku tanimli degil
		System.out.println("SA");
		System.out.println(staticKeyWord .b);
	}
}
