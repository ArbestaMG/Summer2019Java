package day50_Abs_continue;

public class Dog extends Animal {

	public Dog(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		
	}
@Override
	public void speak() {
		System.out.println("Dog speaks woofs");
	}

	public void eat() {
		System.out.println("Dog eats KFC");
	}
	public void sleep() {
		System.out.println("Dog sleeps 8 hours");
	}
	public void drink() {
		System.out.println("Dog drinkgs milkshake");
	}
}
