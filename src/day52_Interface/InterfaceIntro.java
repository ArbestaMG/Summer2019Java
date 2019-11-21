package day52_Interface;

public interface InterfaceIntro {
	
	public abstract void methodA();// ABSTRACT OLUR
	public static void methodB() {} //	STATIK OLUR
	public default void methodC() {}// DEFAULT OLUR
	// public InterfaceIntro(){  }        //   CONS OLMAZ
	//public void method() {}             //   INSTANCE METHOD OLMAZ CUNKU CONS YOK. CONS OLMADIGI ICIN OBJE YOK
	int a=100;// buna statik yazsak ta yazmasak da bu her turlu statik;
	
		public static void main(String[] args) {
	System.out.println(a);
		}
	
}

interface Data{
	
}
class A{
	
}
class B extends A{
	
}
// class can only extend one class
// but class can implement multiple interface
class Test implements InterfaceIntro,Data{
	// subtype 			supertype
	
	@Override
	public void methodA() {

	}
		
}
	
	

