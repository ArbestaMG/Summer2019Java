package day38_CustomClassContinue;

public class Employee {

	String name;
	String id;
	int age;
	String SSN;
	String title;
	double salary;
	
	public Employee(){
		
	}
	
	public Employee(String name,String id,int age,String SSN,String title,double salary) {
	this.name=name;
	this.id=id;
	this.SSN=SSN;
	this.age=age;
	this.title=title;
	this.salary=salary;
	}
	
	public void getinfo() {
		System.out.println("Employee name is  "+name);
		System.out.println("Social security number is "+SSN);
		System.out.println("Employee age is "+age);
		System.out.println("Job title is "+title);
		System.out.println("Employee id is "+id);
		System.out.println("Salary is "+salary);
	}

}
