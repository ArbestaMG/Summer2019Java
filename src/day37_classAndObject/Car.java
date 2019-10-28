package day37_classAndObject;

public class Car {
/*
 Topic:  Class & Object
            1. instance variables
            2. instance methods
            3. custom class
Package: day37_classAndObject
car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
    car1 --> Audi Q7 2020, white,  100K, 10, 1232112112
        car1.start() ==>  Audi
    car2 --> Tesla ModelS 2025, red, 60K, 20, 231123123
        car2.start()  ==> Tesla
object: instance of the class, created from the class
class: where the objects came from, determines how the object should behave
Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
    Dog1 --> German Shepard, XXL, 5, pink, Lassie
        Dog1.eat() ==>   Lassie
    Dog2 --> Tibetan mastiff, small, 3, red, KIKO
        Dog2.eat() ==> KIKO
instance variable: object variables, MUST be declared in the lcass and outside any method
local variable: variables that's created within the method
 */
	
	String model;
	int    year;
	String color;
	double price;
	long mileage;
	String brand;
	
	public void drive() {
		System.out.println("Driving "+model);
	}
	public void start() {
		System.out.println(model+ " is starting");
	}
	// burada bilgileri istiyoruz . 2020-toyota-corolla-white-10000$
	public void getInfo() {
		System.out.println(year+ " "+brand +", "+model+", "+color+", "+ "$"+price);
		
	}
}
