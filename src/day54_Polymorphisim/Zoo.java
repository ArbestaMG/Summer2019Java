package day54_Polymorphisim;

class Animal{
    
    public void Talk() {
        System.out.println("Animal is talking");
    }
    
}
class Tiger extends Animal{
    
    public void Hunt() {
        System.out.println("Tiger is hunting");
    }
    
    public void Talk() {
        System.out.println("Tiger is talking ==> Roar");
    }
}
class Octopus extends Animal {
    
    public void Swim() {
        System.out.println("Octopus is swimming");
    }
    
    public void Talk() {
        System.out.println("Octopus is talking ==> gologolo");
    }
    
}
public class Zoo {
    
    public static void main(String[] args) {
        Tiger tiger1 =  new Tiger();
        Tiger[] Tigers = { tiger1, new Tiger() };
        
        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus() };
        
        Animal        animal1     =   new Tiger();
//  reference type    referenceName    object
            animal1.Talk();
           // animal1.Hunt();
                    // reference type decides what can be called, 
            // hunt method is not exist in reference type
        
        Animal animal2 = new Octopus();
        // burada animal2.swim yapamiyoruz cunku animal da swim yok
        animal2.Talk();// talk caigirinca octopusu cagiriyor.
        
    }
    
}
