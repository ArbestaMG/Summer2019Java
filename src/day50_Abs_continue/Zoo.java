package day50_Abs_continue;

public class Zoo{
public static void main(String[] args) {

	Cat a1=new Cat("Van",50,"Black","Cece");
	
	a1.drink();
	System.out.println("==========");
	System.out.println("==========");
	a1.getInfo();
}

}
/*

abstract class: Countries
           Data: name, flag, language, population, religion, rivals, capital city
           
           constructor that can set all those data
           
       Actions (abstract):  exports(parameter),  import(prameter),
                               economy(), currency()..
                               
                               
   sub class: 
           South Korea
           USA
           Kazakhistan
           New Zealand
           Mother Russia
           Turkey
           ....
                           
abstract method, inheritance, abstract class, method overriding ..            
   
   
*/