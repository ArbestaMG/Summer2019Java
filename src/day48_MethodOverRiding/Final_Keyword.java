package day48_MethodOverRiding;
/*
final keyword: constant , can not be changed or modified

final keyword can be only applied to :

variables: we can not reassign. instance variable and static variables MUST be assigned IMMEDIATELY
//yani yazidigimiz gibi deger vermemiz lazim
local  variable needs to be assigned before use


methods: the implementation of the method can not be changed. final methods can not be override


 classes: final class cannot be super class, but can be sub class
                                final classes are immutable, they cannot be extended
*/

class Credentials{
	private final String Username="Cybertek";//can not reasign
	private final String Password="Batch12";// can not reassign
	
	//public void setUsername(String Username) {// SETTER YAZAMAYIZ
		//this.Username=Username;}
		
		public String getUsername() {	//GETTER YAZABILIRIZ
			return Username;
		
	}
}
class Holly{
	/*final*/ public void printName() {// bunun basina final koyarsak asagina hata aliriz. final yazinca degismez
		System.out.println("Erhan");
	}
}


public class Final_Keyword extends Holly{
	@Override
	public void printName() {
		System.out.println("BEBE");
	}
	final int age=100;

	
	public static void main(String[] args) {
		
		double num=add(3.4,4.2);
		System.out.println(num);
		
		final String SSN="12345678";// bunu koyduk daha fazla assign edemeyiz
		// SSN="1233"; bu olmayacak
		System.out.println(SSN);
	
		final String DateOfBirth;
		
		//System.out.println(DateOfBirth);// hata veriyor
		
		Final_Keyword obj=new Final_Keyword();
		System.out.println(obj.age);//0
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	private static double add(double x,double y) {
		return(x+y);
	}
}
