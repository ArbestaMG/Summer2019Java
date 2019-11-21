package day49_Abstraction;


abstract class shape{
	public abstract void Area();
	
}

abstract class T extends Shape{
	//public abstract void Area(); inherited
}

final class triangle extends Shape {
	@Override
	public void Area() {
		System.out.println("Area of the triangle is ");
		
	}
}


public class Practice {

}
