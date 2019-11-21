package day53_Interface;

public class Dealership {
public static void main(String[] args) {
	Tesla_Model3 car1=new Tesla_Model3();
	car1.Charge();
	car1.start();
	
	System.out.println();
	
	Jeep_Wrangler car2=new Jeep_Wrangler();
	car2.Pumpgas();
	car2.start();
	
	System.out.println();
	
	Toyota_Hybird car3=new Toyota_Hybird();
	car3.Charge();
	car3.SelfDriver();
}
}
