package day29_ReturnMethod;

public class ReturnMethod {
public static void main(String[] args) {
name();// this is a string value
System.out.println(name());// return methods are eother printed or assigned to the value

String str=name();
System.out.println(str);
}

// if the return type of the method is void
public static void method1() {
	System.out.println("Hello");
	return;
	
	
}// if the return type of the method is not void/ void olmadigi zaten we must return a value
public static String name() {
	return "z";
}
public static boolean result() {
	return 8>9;// veya true false de yazabiliyirz
	
}
}
