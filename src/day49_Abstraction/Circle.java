package day49_Abstraction;

public class Circle extends Shape{

	double radius;
	final double PI=22/7;
	
	public Circle(double radius) {
		this.radius=radius;
		
	}
	@Override
	protected void Area() {
		double Area=PI*radius*radius;
		System.out.println("Area is "+Area);
	}
	
	@Override
	protected void perimeter() {
		double perimeter=2*PI*radius;
		System.out.println("Perimeter is "+perimeter);
	}
}
