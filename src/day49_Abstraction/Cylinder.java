package day49_Abstraction;

public class Cylinder extends Shape {

	double radius;
	double height;
	final double PI=3.14;
	
	public Cylinder(double radius,double height) {
		this.radius=radius;
		this.height=height;
	}
	
	@Override
	public void Area(){
		double area=2*PI*radius*height+(radius*2*PI*radius);
		System.out.println("Your area is "+area);
	}
	
	public void Volume() {
		double Volume=PI*radius*radius*height;
		System.out.println("Your volume is "+Volume);
	}
	public static void main(String[] args) {
	
	}
}
