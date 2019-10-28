package day40_Static_Key_Words;

public class StaticPractice {
	
	static long num1;// bunu direk cagiririz
		   long num2;// bunu cagirmak icin obj olusturmamiz lazim
public static void main(String[] args) {
	
	System.out.println(num1);
	System.out.println(StaticPractice.num1);
	
	StaticPractice obj1=new StaticPractice();
	System.out.println(obj1.num2);
	
	
	StaticPractice.method1();
	// StaticPractice.method2();// bu olmaz cunku static degil. Static method sadece staticleri kabul eder
	 
	StaticPractice obj=new StaticPractice();
	obj.method2();
	
	obj.method1();
}

public static void method1() {
	System.out.println("1. method");
}

public void method2() {// belongs to the object, not share with class(instance)
	System.out.println("2. method");
}
}
