package day44_AccessModifiers;

public class Import_Statement {
/* import:
			import packageName.className;
		//imports a single class from the package
		Ex: import java.util.ArrayList;
		
			*******************
			
			import packageName.*
		//imports all the classes from the package
		Ex: import java.util.*;	
		
		
		static import:used for importing the class members
		
			import static packageName.ClassName.StaticName
					
*/
	public static String name="Jelly";
	public static String id="007";
	
	private static String Password="cybertek";
	
	static int age=20;// bunu sadece class icinde kullanabiliriz. yani day44 icinde
	private double salary=110000;
	
	public static void printHello() {
		System.out.println("hello");
	}
}
