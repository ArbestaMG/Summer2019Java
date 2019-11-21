package office_Hours1;

public class Jdk {

	/*
	 jdk==>jre + development tool
	 		jvm    java compiler
	 		
	 String ==> reverse
	 
	 methods:void, return, constructor, static methods
	 // all methods can be overloading
	  
	  Overloading vs OVerriding
	  substring(2),subString(0,2) // overload. same name diff parameter
	 1)Inheritance: extends parents==>child
	 2)Encapsulation: private==>getter//setter
	 3)Abstraction==> abstract class==> can not create obj
	 				  abstract method==
	 */
	public static void main(String[] args) {
		
		String real="";
		
		String word="I am student";
		for(int i=word.length()-1;i>=0;i--) {
			real+=word.charAt(i);
		}System.out.println(real);
		
	//reverse icin 2. yol 	
	StringBuilder b=new StringBuilder();
	b.append(word);
	b.reverse();
	System.out.println(b);
	
	StringBuilder car=new StringBuilder();
	
	car.append("Toyota");
	System.out.println("Firts car is "+ car);
	
	car.append(", Audi");// bu muteabla yani mudahele edebilirsin
	System.out.println("Second car is "+ car);
	
	System.out.println(car.replace(0,6,"BMW"));
	System.out.println(car.delete(0, 3));
	
	
	
	
	}

}
