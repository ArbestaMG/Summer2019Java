package day43_JavaRecap;

public class Practice {
public static void main(String[] args) {
	

	StaticKeyword.printName();// bu static method oldugu icin cagirabilirz
	
   //	StaticKeyword.printName2(); bu olmaz cunku static degil
	
	Practice.printName();// bu ikiside semra
	printName();// semra
}
	public static void printName() {
		System.out.println("Semra");
	}
	

}
