package day40_Static_Key_Words;

public class StaticVar {
static String name;
static double staticNum;

int num1;// bunu direk sout yazip yapamazsin , once obj tanimlaman gerekir

public static void method1() {
	System.out.println("open the browser");
}
public static void main(String[] args) {
	StaticVar.method1();
	
	
//	System.out.println(num1);// boyle olmaz asagidaki gibi olur
	
	
	StaticVar objectA=new StaticVar();
	System.out.println(objectA.num1);// 0
	
	System.out.println(StaticVar.name);// null
	
	StaticVar.name="Pele";
	System.out.println(name);// pele
	
	StaticVar obj1=new StaticVar();
	obj1.name="Bebe";
	
	System.out.println("=====");
	StaticVar obj2=new StaticVar();
	System.out.println(obj2.name);// bebe verdi cunku static variables can only have one copy
	
	obj2.name="Celo";
	System.out.println(obj2.name);//Celo
	
	System.out.println(obj1.name);//Celo
    System.out.println("========");
    
    
	System.out.println(StaticVar.staticNum);//0.0
	
	
	StaticVar object1=new StaticVar();
	object1.staticNum=4.5;
	System.out.println(object1.staticNum);//4.5
	
	StaticVar object2=new StaticVar();
	System.out.println(object2.staticNum);//4.5
	
	/*
	 Static methods: a method that we can call through the class name
	 */
	staticKeyWord.method1();
}
	public static void printHello() {
		
	}
	
}

