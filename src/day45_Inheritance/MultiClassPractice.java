package day45_Inheritance;


class Data{
	public String name;
	private String age;
	String id;
	public static String company="Apple";
	protected String birthday;
	
	public void printHello() {
		System.out.println("public hello");
		
	}
	private void printHole() {
		System.out.println("private Hola");
	}
	void Aloha() {
		System.out.println("default Aloha");
	}
}
public class MultiClassPractice {
	public static void main(String[] args) {
		Data obj=new Data();
		System.out.println(obj.name);//public is visible at everyhwere
		System.out.println(obj.id);// default acces visible in the class
		System.out.println(obj.company);
		
		System.out.println("=====");
		
		obj.Aloha();
		obj.printHello();
	/*
	 if those two classes were located in two different packages,
	  then the default acces modifiers is not gonna be visible
	 */
	}
}
