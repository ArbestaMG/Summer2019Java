package day42_OOP_Encapsulation;

public class EmployeeInfo {
/*
 Name
 SSN
 age
 salary
 
 */
	private String name;
	private long SSN;
	private byte age;
	private double salary;
	// NAME
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	//SSN
	public long getSSN() {
		return SSN;
	}
	
	public void setSSN(long SSN) {
		this.SSN=SSN;
	}
	//AGE
	public byte getage() {
		return age;
	}
	public void setage(byte age) {
		this.age=age;
	}
	//SALARY
	
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setInfo(String name,long SSN,byte age,double salary) {
		setname(name);
		setSSN(SSN);
		setage(age);
		setsalary(salary);
		
	}
}
