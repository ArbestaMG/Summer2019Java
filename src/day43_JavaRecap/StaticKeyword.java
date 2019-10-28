package day43_JavaRecap;

public class StaticKeyword {
	public static String name="Filiz";
	public String Insname="Nane";
	
	
	public static void printName() {
		System.out.println(name);
	//	System.out.println(Insname);bu olmaz cunku instance variable static method da cagirilmaz
	}
	
	public void printName2() {
		System.out.println(Insname);// bu instance method oldugun icin cagirabildik
		System.out.println(name); // bu static oldugu icin her yerde cagirilir
	}
}
