package day49_Abstraction;


public abstract class Animal {

	public abstract void eat();
	public abstract void sleep();
	
	public static void main(String[] args) {
		
	}
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("Cat eats fish");
	}
	@Override
	public void sleep() {
		System.out.println("Cat sleeps 14 hours");
	}
	
}
class Kingkong extends Animal{
	
	public void eat() {
		System.out.println("Kingkong eats everything");
	}
	public void sleep() {
		System.out.println("Kingkong never sleeps");
	}
}

class Test{
	public static void main(String[] args) {
		Kingkong obj1=new Kingkong();
		obj1.eat();
		
		Cat obj2=new Cat();
		obj2.eat();
	

}
}