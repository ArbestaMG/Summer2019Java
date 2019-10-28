package day27_CustomMethods;



public class VoidMethod {
/*
 	decleration of method:
 	access-modifier    specifier     return-type    methodname(){}
 */
	public static void main(String[] args) {
		myFirstMethod();
		even1to100();
		
	}
	
	public static void even1to100() {
		
		for(int i=0;i<100;i++) {
			if(i%2!=0) {
				continue;}
			System.out.print(i+" ");
		}
		
	}
		public static void myFirstMethod() {
		//public static void main(String[]){} // bu calismadi cunku daha onceden vermem lazim
			//methods must be decleared within the class
			
			System.out.println("Hello world");
			System.out.println("Hello cyber");
			System.out.println("Hello man");
			
			
	
	}
	
	
}
