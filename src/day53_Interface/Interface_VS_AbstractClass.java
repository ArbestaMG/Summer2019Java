package day53_Interface;

public interface Interface_VS_AbstractClass {

	
	public abstract void method1();
	public abstract int method2();
	
	void method3();// public
	void method4();// public
	
	public default void mm() {
		//predicate
	}
	
	//protected abstract void method5();
	// public protected abstract void method5();
	
	int a=10;//public// bunu hemen tanimladik yoksa hata verir.
	//public final static int a;
	
	public static void main(String[] args) {
		System.out.println(a);
	}
}
class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}