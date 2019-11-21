package day46_SuperKeyword;

class A {
    
    String name = "Madina";
    
    public void methodA() {
        
    }
    
    
    public A ( int a ) {
        
    }
    
}
public class SuperKeyWord extends A {
        //      sub               super
    
    public SuperKeyWord(double b) {
    
		super(10);// burada 10 verdik cunku line 9 da int a constructor var.
		//super class const must be called in sub
	}
	

		

	
/*
 super. : used for calling instances(instance variable and methods) from the super class
 
 this. : used for calling instances from the class itself
 
 constructor: at least one constructor from thesuper class has to be called in the sub class
 
 super:used for calling the constructors from the super class. Must be used in the sub class
 
 this: used for calling the constructors from the class itself
 
   bu asagidaki gibi de yapabiliriz 
   public static void main(String[] args) {
	A obj1=new A();
    System.out.println(obj1.name);
    
    
	*/
    public static void main(String[] args) {
    	SuperKeyWord obj1=new SuperKeyWord(0);
    	obj1.methodA();
	}
		 
	    public void method() {
	        super.name = "Mahir";
	        this.name = "Ihsan";
	        super.methodA();
	        this.methodA();
	    }
	    
	    
	}
