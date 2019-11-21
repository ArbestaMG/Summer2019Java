package day45_Inheritance;

public class Protected_VS_Default {
	public static void main(String[] args) {
		
	}
protected String name;
	public	String id;
		
protected void printHello() {
	System.out.println("protected Hello");
}
void printHola() {
	System.out.println("default hola");
}

public static void lastname() {
	System.out.println("Here is static lastname");
}
}
class cybertek{
	public static void main(String[] args) {
		Protected_VS_Default obj=new Protected_VS_Default();
		obj.printHello();
		obj.printHola();
		System.out.println(obj.id);
		System.out.println(obj.name);
	
		Protected_VS_Default.lastname();
	}
}
