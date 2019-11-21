package day49_Abstraction;

public class Square extends Shape {
double side;

public Square(double side) {
	this.side=side;	
}


@Override
protected void Area() {
	double Area=side*side;
	System.out.println("Area is "+ Area);
}
@Override
protected void perimeter() {
	double perimeter= side*4;
	System.out.println("Perimeter is "+ perimeter);
}
}
