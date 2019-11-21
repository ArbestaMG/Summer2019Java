package office_Hours1;

public class Cat extends Animal{
	
String breed;

public void scratch() {
	System.out.println(breed +" is scratcing");
	
}
public static void main(String[] args) {
	

Cat obj1=new Cat();
obj1.sleep();
}
}