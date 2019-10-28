package day38_CustomClassContinue;

public class Employeesobject {
public static void main(String[] args) {
	
	Employee employee1=new Employee();
	employee1.age=27;
	employee1.id="sdet15";
	employee1.name="Oguz";
	employee1.salary=85000;
	employee1.SSN="123 456 1234";
	employee1.title="Beginner sdet";
	employee1.getinfo();
	
	System.out.println("==============");
	
	Employee employee2=new Employee("Leonardo","007",30,"12345678","technician",10000) ;
	
	employee2.getinfo();
		
	
	
	
}

}
