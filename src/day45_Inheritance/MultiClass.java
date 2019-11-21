package day45_Inheritance;

public class MultiClass {
	/*
	 we can have multiple class in a java file
	 there can only be one public class, and the "public class name must match with the java file name"
	 
	 other classes we are creating must have default access modifiers
	 */
public static void main(String[] args) {
	System.out.println("Main public class");
}

}
class A{// buna public verirsek
	public static void main(String[] args) {
		System.out.println("default class A");
	}}
class B{
		public static void main(String[] args) {
System.out.println("default class B");			
		}	}
