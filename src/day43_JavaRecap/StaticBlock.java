package day43_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
public class StaticBlock {
    /*
     1. static keyword
        2. initializer blocks
        3. Encapsulation
        4. static import
        5. Multi-class
        6. Access modifiers: public, private, default
    
next topics: OOP Inheritance, Method Overriding, Final
package: day43_JavaRecap
local Variables: variables that are declared within the method or blocks
            only accessible within the method or block
instance variable: belong to the object. each object has its own copy of instance variables
static keyword: any feature that has static keyword belongs to the class, also can be called through the class.  ( class members )
static members:
            1. static variables
            2. static methods
            3. static initializer block
            4. static inner class (nested class)
static variable: variable that's shared by class and objects, there is only one copy
static methods: methods that we can call it through the class name ( beong to class)
            Ex:     Webdriver driver = WebDriverFactory.getDriver();            
                static methods only accepts class members (static)
                none statics can ONLY be called through the object
import:
        import PackageName.className;  ==> to import a single class
this(): used for calling the constructors
            we can only used it in the constructor
this. : used for calling the instance variables
        this. we can used in any object isnstances
     */
    // static ChromeDriver driver = new ChromeDriver();
    //  static Excel data ;
    /*
        static{
            driver.manage().window().maximize();
        }
        
     */
    
    static String[] arr = new String[3];
    static ArrayList<String> list = new ArrayList<>();
        double salary;
    
    static {
        
        System.out.println("static block");
        arr[2] = "Alla";
        arr[0] = "Kateryna";
        arr[1] = "Ruslan";
        
         list.addAll( Arrays.asList(arr) );
         
        // salary = 5000;  // static only accepts static
         
         StaticBlock obj1  = new StaticBlock(); 
            obj1.salary = 4000;
            System.out.println( obj1.salary ); // 4000
    }
    public static void main(String[] args) {
        System.out.println("main method");
        
        System.out.println( Arrays.toString(arr) );
        System.out.println(list);
        
        StaticBlock obj1  = new StaticBlock(); 
        System.out.println( obj1.salary ); // 0.0
    }
}
