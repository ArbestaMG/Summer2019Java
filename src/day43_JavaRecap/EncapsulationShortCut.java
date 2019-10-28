package day43_JavaRecap;

public class EncapsulationShortCut {
	
	private int age=26;// right click, source, generate getter and setters
	private int id=58;
	private int salary=95000;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
