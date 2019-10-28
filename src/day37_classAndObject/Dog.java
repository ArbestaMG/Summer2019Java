package day37_classAndObject;

public class Dog {

	String breed;
	byte age;
	String size;
	String color;
	String name;
	char gender;
	String food;
	
	
	public void getinfo() {
		System.out.println(breed+", "+size+", "+", "+age+" years old, "+color+", name is "+name+", gender is "+
	gender);
	}
	
	public void eat() {
		System.out.println(name+" is eating "+ food);
	}
	public void play() {
		System.out.println(breed+" is playing");
	}
}
