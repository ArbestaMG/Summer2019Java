package day27_CustomMethods;

public class MethodwithArgument {
	/*
	 methods with argument:
	 access-modifier    specifier		return-type   name(parameter){
	 }
	 
	 parameters:any data-type
	 
	 */
	
	public static void main(String[] args) {
		//oddOrEven();  this method designed to take an argument. method need to argument in order to perform its task
	oddOrEven(50);
	int z=100;
	oddOrEven(z);// burada z'yi a olarak isleme aldi
	sumOf2(30,40);
	}
	
	
	public static void oddOrEven(int a) {
		if(a % 2==0) {
			System.out.println(a+" is even");
		}
		else {System.out.println(a+" is odd");
	}}
		
		public static void sumOf2(int a,int b) {
			System.out.println(a+b);}
		

		
	}

