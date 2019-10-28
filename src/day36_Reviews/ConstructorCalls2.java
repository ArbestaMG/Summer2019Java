package day36_Reviews;

public class ConstructorCalls2 {
    
    public ConstructorCalls2() {
        //   this();   // constructor cannot call it self
        
        this(true);  // constructor cannot contain it self
        
        System.out.println("default");
        
    }
    
    public ConstructorCalls2(boolean a) {
        // this( true );  // constructor cannot call it self
        
    //  this();
    //  this(false);   // constructor cannot call it self
        
        System.out.println("boolean");
        
    }
    
    
    public ConstructorCalls2(String name) {
    //  this("Hello");    constructor cannot call itself
        
        this('A');  // boolean   default   char
        
        // ConstructorCalls2();  // constructor canno be called by constructorName
        System.out.println("String");     // String
        
    }
    
    public ConstructorCalls2(char ch) {
        this();  //  boolean  default
    //  this("Hello");  // constructor cannot contain it self
        System.out.println("Char");
        
    }
    
    
    public static void main(String[] args) {
        
        ConstructorCalls2 obj = new ConstructorCalls2( "Hello");
        
        
    }
    
    
    
    
    
}