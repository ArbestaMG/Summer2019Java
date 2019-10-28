package day29_ReturnMethod;

public class OverloadMainMethod {
public static void main(String[] args) {// bu Stringi silip yerine baska bisey yazarsak uygulama calismaz,coker
	
	System.out.println("String Array");
	
	// bu asagida yeni main methodlari call ediyoruz
	boolean[] array1= {true,false};
	main(array1);
	
	double[] array2= {1,2,3};
	main(array2);
	
	int[]array3= {4,5,6};
	main(array3);
	return;//bunu buraya koydum cunku ortaya koyarsam main methoddan cikar, islemi direk keser atar
	
	
}


	public static void main(int[]a) {
		System.out.println("int array");}
	 
	
	
	
	public static void main(double[] b) {
		System.out.println("double array");	}
	
	
	
	public static void main (boolean[] c) {
		System.out.println("boolean array");}
	
	
}
