package day37_classAndObject;

public class DogClass {
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	System.out.println(dog1.name);// burada tanimlamadigimiz icin null verdi
	
	
	dog1.breed="Kangal";
	dog1.age=2;
	dog1.color="Brown";
	dog1.name="Karabas";
	dog1.size="Huge";
	dog1.gender='M';
	dog1.food="Meat";
	
	System.out.println(dog1.name);
	
	dog1.getinfo();
	dog1.eat();
	dog1.play();

	
}}
