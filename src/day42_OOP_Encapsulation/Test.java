package day42_OOP_Encapsulation;

public class Test {
public static void main(String[] args) {
	TestData obj= new TestData();
//	System.out.println(obj.name); coz name is private
	System.out.println(obj.getname());
	
	System.out.println(obj.getid());

	
	obj.setName("Aydin");
	System.out.println(obj.getname());
	
	obj.setid(1000);
	System.out.println(obj.getid());
}
}
