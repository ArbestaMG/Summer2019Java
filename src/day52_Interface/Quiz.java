package day52_Interface;
//Quiz 13
class C{
    public C() {
        System.out.print("A ");
    }
}
class D extends C{
    
    public D() {
        //super();  //A
        System.out.print("B ");
    }
}
abstract class abstractB{
    
    public abstract void method1();
    public abstract void method2();
    
    
}
public class Quiz extends abstractB{
    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void method1() {
        // TODO Auto-generated method stub
        
    }
    
    
    // assessment quiz 13
    static int a = 10;
    
    public  void methodB() {
        
    }
    
    
    public static void main(String[] args) {
        B obj = new B();
        System.out.println();
        
        Quiz obj1 =new Quiz();
        obj1.a =20;
        
        
        Quiz obj2 = new Quiz();
        
        System.out.println(obj1.a); //20
        
        System.out.println(obj2.a);  // 20
        
        int[] arr = {2, 1, 0 };
        //  index:   0  1  2 
        for(int i : arr) {
            System.out.print(arr[i] +" ");
            // arr[2] ==> 0
            //  arr[1] ==> 1
            // arr[0] ==> 2
            
        }
        
        
    }
    
    
    
    
    
    
    
}