package day39_Review;

public class Cellphone {
/*
 instance variable: created outside methods, within the class. it is also called fields;
 
 local variable:created within the methods, not visible to other methods, can only be used within that methods
 
 instance methods: methods that does not have static specifier do have return type
 
 class: where the objects are come from. its the blueprint of the object determines how object will behave
 
 object:instance of the class , we can store different datas to objects.
 
 object creation:
 		ClassName obj= new Existing constructor;
 */
	String brand;// instance variable
	double screen;
	String color;
	double price;
	String model;
	
	public Cellphone() {// duz constructor
		brand="Nokia";
		model="3310";
		screen=10;
		color="green";
		price=250;
		
	}
	
	public Cellphone(String brand,	double screen,	String color,	double price,	String model) {
		this.brand=brand;
		this.screen=screen;
		this.color=color;
		this.model=model;
		this.price=price;
	}
	
	public void call(int x) {// instance methods
		System.out.println(brand+" "+model+" is calling the number "+x);
	}
	public void text(int y) {
		System.out.println(brand+" "+model+" is exting the number "+y);
	}
	public void takepic(int x,String y) {
		System.out.println("Taking the picture of "+y+" "+x+" times");
	}
	
	public void getinfo() {
		System.out.println("your phone is "+brand+" "+ model);
		
	}
}
