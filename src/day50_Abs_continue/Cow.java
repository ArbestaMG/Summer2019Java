package day50_Abs_continue;

public class Cow extends Animal{

	public Cow(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}
	public void speak() {
		System.out.println("Cow speaks mooooo");
	}
	public void eat() {
		System.out.println("Cow eats grass");
	}
	public void sleep() {
		System.out.println("Cow never sleeps");
	}
	public void drink() {
		System.out.println("Cow drink fanta");
	}
}
