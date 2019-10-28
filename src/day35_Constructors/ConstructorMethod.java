package day35_Constructors;

public class ConstructorMethod {
/*
package: day35_Constructors             
Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
Constrcutor :   special method
         1. Every class MUST have constructor
         2. if we don't give the constructor, then compiler will give the default constructor.
         3. execution depends on the creation of the object
         4. constructor' name MUST be same with class name
         5. constructors can be overload
create object from a class:
        ClassName  obj  =  new  existingConstructor;
decleration of constructor:
        default (no-arg constructors):
                access-modifier  className(){
                }
        there is no return-type
        therte is no specifier
        constructor name MUST be same with the class name
constructor call:
        1. only a constructor can call another constructor
        2. constructors cannot be called by thier name, we MUST use this() keyword to call current class' constructor
        3. constructor call MUST be the first statement in the constructor
        4. one constructor can ONLY call one constructor
        5. constructor cannot call it self
        6. constructor cannot contain itself
 */
	

    public ConstructorMethod(int a) {
        this(10.5);
        System.out.println("constructor with argument: "+a);
        
    }
    
    public ConstructorMethod(double a) {
    //  this(10.5);  // constructor cannot call it self 
        
    //  this(10);  // constructor cannot contain itself
        System.out.println("constructor with argument: "+a);
    
        
    }
    
    public ConstructorMethod(boolean a) {
        // ConstructorMethod(9);   // constructor cannot be called by constructorname
    
    //      System.out.println("constrcutor with argument of: "+a);
                            // the constructor call HAS to be the priority in the constructor
            
    //  this(100);
        this(10.5);
        
        System.out.println("constrcutor with argument of: "+a);
    }
    
    
    public static void main(String[] args) {
        
        // ConstructorMethod obj = new ConstructorMethod("Hello");
                                        // the constructor is not exist
        
    //  ConstructorMethod obj2 = new ConstructorMethod();
                            // the constructor is not exist
        
        ConstructorMethod obj3 = new ConstructorMethod(100);
        
        System.out.println("====================================");
        
        method1();
        
    //  ConstructorMethod();
        
        ConstructorMethod obj4 = new ConstructorMethod(true);
        
    }
    
    
    public static void method1() {
        
        
    }
    
    
}
