package day50_Abs_continue;

public abstract class Animal {
	//Variables
	public String gender;
	public int age;
	public String color;
	public String name;
	
	//Constructor
	public Animal(String gender,int age,String color,String name){
		this.gender=gender;
		this.age=age;
		this.color=color;
		this.name=name;
		
		System.out.println("This is a "+gender+"  "+age+" years old and its color is "+ color);
		System.out.println("Its name is "+name);
	}
	
	//Methodslar//Actions
	public abstract void speak();
	public abstract void eat();
	public abstract  void sleep();
	public abstract void drink();
	
	//method// this is not abstract coz its common for all animals
	   public void getInfo() {
	        System.out.println("NickName is "+name);
	        System.out.println("Gender is "+gender);
	        System.out.println("Color is "+color);
	        System.out.println("Age is "+age);
	        System.out.println("====================================");
	    }
	    
	
	// Creating main method and object
	public static void main(String[] args) {
		
		Dog animal1=new Dog("Wolf",10,"gray","Leo");
		
		animal1.eat();
		animal1.color="Black";
		
		System.out.println("=================");
	
		Cat animal2=new Cat("Pars cat",5,"Rainbow","Minnos");
		System.out.println("=================");
		animal2.speak();
		Cow animal3=new Cow("Angus",1,"White black","Milka");
		
	
	/*
	 WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
	 */
		
		/*
		 
Abstraction: concentrating on importance/essential things without worrying about the details


abstract keyword: can only applicable to class and methods


abstract class:
 				we cannot create object of
                it's a class that's meant to be extended 
                cannot be final
                class' access modifiers can only public or default
                
                
abstract method:
 				a method that's meant to be override
                 a method without body/implementation
                 cannot be static, private, final
                 Only the instance method can be override
                 hides the implementation details
                 
                 
declearation of abstract method:
                        Access-Modifier  abstract  return-type  name(parameter);
                        Access modifiers: public, protected, default
                        return-type: void, primitives, non-primitives(object)
                        name: can be any name
                        parameter: any data-type ( primitives and non primitves)
                        
overriding: 
			same method name, same parameter, same return-type
            access modifier needs to be same or more visible
            MUST override in sub class
            @Override  must be applicable 

		 */
}}

