package day51_Abstraction_Recap;



abstract class Test{
    
    public Test(){
        
    }
    
    abstract void m();
    
    protected abstract void m(int a);
    
    public static void main(String[] args) {
        
    }
        
}
public class practice extends Test{
    
    // abstract void m();
    
    @Override
    void m() {
        practice obj = new practice();
    }
    
    @Override
    public void m(int a) {
        
    }
    
        final int num2 = 30;
        final static int num3 = 40;
    
    public static void main(String[] args) {
        final int num;  // constant
            num = 10;   
        System.out.println(num);
        
        
    }
}
final class A{
    
}
// class B extends A{}  final class cannot be super class
abstract class C{
    
    int num;
    static int num2;
    
    public static void main(String[] args) {
        
    }
    
    static {
        
    }
    
    {
        
    }
    
    abstract void absmethod();
    
}
abstract class D extends C{
    /*
    @Override
    void absmethod() {
        
    }
    */
}
/*
Abstract method: can only be declared in abstract class and interface

					hiding the impleantation details(does not have body)
					
					its meant to be overriden
					
					can not be final,private,static
					
a class can only extend one class, a class can be extended by multiple classes


Abstract class vs Non Anbstract class:
	abstract class: we can have abstract methods and all the non abstract methods(
	
					meant to be inherited
					
					can not be final
					
					can not create object(object is concrete, abstraction is not concrete
					
		//bu class abstracti uzattigimiz class
	non abstract class : can not have abstract methods
			
						we can create objects
						
						can be final(can not extended)
						
	
	final keyword: can only be applicable to variables,methods and classes/// not blocsk
	
	variable: variables becomes constant
	
	methods: the method can not be overriden
	
	class: class becomes immutable, the class can not be the super class.
*/