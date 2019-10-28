package day42_OOP_Encapsulation;

public class Apple {
public static void main(String[] args) {
	EmployeeInfo Oguz=new EmployeeInfo();
	
	Oguz.setname("Smith");
	System.out.println(Oguz.getname());
	
	
	Oguz.setSSN(1234512345);
	System.out.println(Oguz.getSSN());
	
	Oguz.setage((byte)250);
	System.out.println(Oguz.getage());//-6 verdi cunku byte disinda
	
	System.out.println("===========");
	
	EmployeeInfo John= new EmployeeInfo();
	
	System.out.println(John.getname());
	
	John.setInfo("Aly",12342332, (byte)26, 95000);
	System.out.println(John.getname());
	System.out.println(John.getsalary());
	System.out.println(John.getSSN());
	System.out.println(John.getage());
}
}
