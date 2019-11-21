package day49_Abstraction;

public abstract class Abstraction {
	
	public abstract void startTheCar();
	

}
class Toyota extends Abstraction {
	
	@Override
	public  void startTheCar(){
		System.out.println("Hit the break");
		System.out.println("Push the start");
		System.out.println("Release the break");
		
	}
	
	public static void main(String[] args) {
		
		
		//Abstraction obj=new Abstraction();// bu olmaz
	}


}

class Tesla extends Abstraction{
	//regular class Must implemetn the abstract method from the abstract class
	@Override
	
	public void startTheCar() {
		System.out.println("Voice control");
		System.out.println("Drive");
		
	}
}
/*
 Abstraction: Concentrates on essentials on important things. not worry about the details
 
 car: start() {
 			put the keys
 			turn on the engine
 			start driving
 		}
 		
 		
 abstract method: method that does not have body/implementation
 
       public abstract start();
       
       its a method thats meant to be override(can not be final or private)
       
       Only the instance methods can be override and can be abstract
       
       abstract method can only be decleared in abstract class and interface
       
       		ex: pontanic car:
       				start(){
       					call mechanic
       					put the key in
       					start the engine
       					jump start
       					driver
       					
       					
       			Tesla car:
       			start(){
       				say"start"
       				driver
       				}	
       				
       				
     // abstract class: abstact is something not concrete we can not create object from.
      
      				a class meant to be extended
      				
      				abstract class can not be final
      				
      				if the sub class is regular class, the sub class must override the abstract methods
      				
      				if the sub class is abstract, no need to override
      				
      		why we can not create object from abstract class?
      			abstraction is something not concrete,object
 */
	
	

