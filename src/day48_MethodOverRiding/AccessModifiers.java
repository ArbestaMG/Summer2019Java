package day48_MethodOverRiding;

class Student{

	void methodA() {// METHOD that we are going to override must be inheritable to sub class. 
		//Override method must same or   more visible access modifier
		// private override yapamayiz
		//Default ise== default, protected,public
		//protected ise === protected, public
		//public ise== public
		// return type ayni olmali
	
		System.out.println("Student methodA");
	}
	
	public String methodB() {
		return "B";
	}
	
	protected double salary(double bonus) {
		return bonus+100000;
	}
	
}

public class AccessModifiers extends Student {
	@Override
	public void methodA() {
		System.out.println("Ali veli");
	}
	@Override
	public String methodB() {
		return"overrided B";
	}
	@Override
	public double salary(double bonus) {
		return bonus+200000;
	}
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.methodA();
		obj.methodB();
		obj.salary(1000);
	}
	



}
