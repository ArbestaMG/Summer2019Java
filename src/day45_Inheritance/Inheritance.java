package day45_Inheritance;


class TestBase{
static	String chromeDriver;// default

public static void takeScreenShots() {
	System.out.println("Take SS");
}
private static void closeBrowser(){
	System.out.println("Close Browser man");
}
}

public class Inheritance extends TestBase {
//             child             super	
//			child is gonna inherit all the visible or protected features from the  
	
	//ONEMLI!!!!!!!!!!!!!!!!!!!!!!!
	
	//public and protected access modifiers can be inherit to anywhere
	// default access modifiers: can only be inherited to the class that are in the same package
	//private access modifiers: can not never ever never be inherit to outside of the class
	
	//protected access modifier : only visible to the class that are in the same package but it can be
	// inheritable to the classes outside the package
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		
		takeScreenShots();
		
		//System.out.println(closeBrowser());
	}
/*				
 Inheritance : used for building relationships between classes, it build super and sub relationships between classes
 
 we use "extend" keyword to build super and sub relationships between classes
 
 public class A extends B
 			sub			super
 			child       parent
 sub class(A): its also called child class, sub class can inherit the visible and 
 protected features from the super class
 
 super class(B): its also called parent class,
 */
	
	
	/*
	 Benefits of inheritance: 
	 	-reusability
	 	-easy to maintain
	 */
}
