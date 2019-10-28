package day36_Reviews;

public class ConstructorCalls {
/*
 1)Only a constructor can call another constructor
 
 2)Constructor can not called by constructor name
 
 3)we use "this()" to call constructor. "this" keyword used calling object instances(anything 
 
 4)constructor calls have to be in the first call
 */
	public ConstructorCalls() {
		System.out.println("A");
	}
	
	public ConstructorCalls(int a) {
		this();//A
		System.out.println("B");
	}
	public ConstructorCalls(double a) {
		this(10);// burada int degeri oldugu icin ustteki consu cagirdi
		System.out.println("C");

	}
	
	public static void main(String[] args) {
		ConstructorCalls obj=new ConstructorCalls(10);//A,B olur.
		System.out.println("====");
		ConstructorCalls obj2=new ConstructorCalls();// A olur.
		System.out.println("====");
		ConstructorCalls obj3=new ConstructorCalls(10.5);//A,B,C
	}
}
