package day29_ReturnMethod;

public class SystemExit {
public static void main(String[] args) {
	
	//System.out.println(number());
	method1();// sadece hello world cikiyor cunku bunu completed ve done dan once yazdik. sonra yazsak onlarda
	// cikardi
	System.out.println("Completed");
	System.out.println("Done");
	
}


public static void method1() {
	System.out.println("Hello World");
	System.exit(0);
}
public static int number() {
	if(true) {
		System.exit(0);// bu method ilk geldigi icin direk olarak islemleri durdurdu
	}
	return 5;
}
}
