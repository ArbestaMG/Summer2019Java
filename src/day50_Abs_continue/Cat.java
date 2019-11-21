package day50_Abs_continue;

public class Cat extends Animal {

	public Cat(String gender, int age, String color, String name) {
		super(gender, age, color, name);
		// TODO Auto-generated constructor stub
	}
	
	public void speak() {
		System.out.println(name+" Cat meows");
	}
	public void eat(String food) {
		System.out.println("Cat eats "+food);
	}

	public void sleep(int hours) {// bu aslinda override degil cunku int hour animal classta yok. 
		System.out.println("Cat sleeps 14 hours "+ hours);
	}
	public void drink() {
		System.out.println("Cat drinks hot chocolate");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {// bu overrided
		// TODO Auto-generated method stub
		
	}

}
