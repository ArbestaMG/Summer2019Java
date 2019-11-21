package day49_Abstraction;
 /*
WarmUp: 
    1. create a class called Shape
            Actions: Area(), perimeter(), capacity()
    2. create sub classes of Shape:
                        Circle
                        rectangle
                        square
                        cylinder
        and give the instance variables that are needed to calculate the Area, perimeter, and Volume of those shapes
    3. override super class' Area(), perimeter(), capacity() methods to the sub classes
 */
public class Shape {
    
    protected  void Area() {
        System.out.println("Area is 0");
    }
    
    protected void perimeter() {
        System.out.println("perimeter is 0");
    }
    
    protected void capacity() {
        System.out.println("volume is 0");
    }
    
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20 );
                  rectangle1.Area();  //200.0
        
        Rectangle rectangle2 = new Rectangle(30, 40);
                rectangle2.Area();
                
                rectangle2.perimeter();
                rectangle2.capacity(); //0
                
        Square  square1 = new Square(10);
                square1.Area();  // 100
                square1.perimeter(); // 40
                square1.capacity();  //0
    
        
        Circle circle1 = new Circle(5);
                circle1.Area(); // 78.5
                circle1.perimeter();  
                
                
        Cylinder cylinder1 = new Cylinder(2, 5);
                cylinder1.Area();
                cylinder1.perimeter();
                cylinder1.capacity();
                
    }
    
    
}