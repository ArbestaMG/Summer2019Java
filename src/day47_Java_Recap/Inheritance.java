package day47_Java_Recap;
class A {
    
    public String name1 = "Ayaz";
    
    public void mm() {
        // super.name1 = "Hakan";  // super keyword MUST be used in sub class
    }
    
    public static void N() {
        
    }
    
}
class B extends A{
    
 // public String name1 = "Ayaz"; // Feride
    public String name2 = "Sukran";
    public String name3 = "Erhan";
    
    public static void J() {
        
    }
    
    public void method1() {
        super.name1 ="Feride";
        super.mm();
        super.N();
        this.J();
    }
    
}
public class Inheritance  extends B {
    
//  public String name1 = "Ayaz";
//  public String name2 = "Sukran";
//  public String name3 = "Erhan";
    
    public String name4 = "Mehmet";
    public String name5 ="Mahribana";
    
    
    public static void main(String[] args) {
        
        Inheritance obj = new Inheritance();
        
        System.out.println( obj.name1  ); 
        System.out.println( obj.name2  ); 
        System.out.println( obj.name3  ); 
        System.out.println( obj.name4  ); 
        System.out.println( obj.name5  ); 
        
        System.out.println("===================");
        
        B obj2 = new B();
        System.out.println( obj2.name1  ); 
        System.out.println( obj2.name2  ); 
        System.out.println( obj2.name3  ); 
    //  System.out.println( obj2.name4  );   //super class cannot inherit anything from the sub class
    //  System.out.println( obj2.name5  );  //super class cannot inherit anything from the sub class
        
        System.out.println("=============================");
        
        A obj3 = new A();
        System.out.println( obj3.name1 );
//      System.out.println( obj3.name2  ); //super class cannot inherit anything from the sub class
//      System.out.println( obj3.name3  ); //super class cannot inherit anything from the sub class
    //  System.out.println( obj3.name4  );   //super class cannot inherit anything from the sub class
    //  System.out.println( obj3.name5  );  //super class cannot inherit anything from the sub class
        
        
        
        
        
        
        
    }
    
    
    
    
}
/*
Java Reveiw: 
1. Inheritance
2. this & super keywords
3. Constructor
Inheritance: super and sub classes

class  Sait  extends  khurshed
//      sub             super
class  Olexander  extends khurshed
//      sub                 super
class  Ibrohim   extends   Olexander
//      sub                    super
sub class: gets more richer, inherits all visible and protected features from the super class
        private access modifier is not inheritable
        default access modifier is only inheritable to the classes that are in the smae package
super class: super class cannot inherit any feature from the sub class
a class can be extended by multiple  ( can have multiple sub classes)
super: refers to the object instance
super. : used for calling instance variables and instance methods
     
     MUST be used in the sub class
    cannot be used in static methods or static block 
this: refers to the object instances
this. : used for calling instance variables  for the class itself
    cannot be used in static methods or static block 
SUPER AND THIS SHOULD ONLY BE USED TO CALL OBJECT ISNTANCES , NOT THE STATICS
*/