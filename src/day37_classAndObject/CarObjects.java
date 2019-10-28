package day37_classAndObject;

public class CarObjects {
public static void main(String[] args) {
	
	Car       car1=       new      Car();
// classname  obj name    kewword  constructor
	car1.brand="Nissan";
	car1.color="Black";
	car1.mileage=65000;
	car1.model="Altima";
	car1.price=10.500;
	car1.year=2016;
	
	System.out.println(car1.brand);
	System.out.println(car1.color);
	System.out.println(car1.mileage);
	System.out.println(car1.model);
	System.out.println(car1.price);
	System.out.println(car1.year);
	
	car1.drive();
	car1.start();
	System.out.println("===========");
	
	
	Car car2=new Car();
	System.out.println(car2.brand);// null
	
	car2.brand="Bmw";
	car2.color="White";
	car2.mileage=10032;
	car2.model="X5";
	car2.price=12049.22;
	car2.year=2014;
	
	System.out.println(car2.brand);
	System.out.println(car2.color);
	System.out.println(car2.mileage);
	System.out.println(car2.model);
	System.out.println(car2.price);
	System.out.println(car2.year);
	
	car2.drive();
	car2.start();
	car2.getInfo();
	
	Car car3=new Car();
	car3.getInfo();
 }
}
