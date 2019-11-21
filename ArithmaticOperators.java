package day06_ArithmaticOperators;

public class ArithmaticOperators {
	
	/*
	 +: addition: adds two numbers togerher
	 -: subtraction: subtracts a number from another number
	 *: multiplication: multiplies
	 /: devision: devides
	  
	  %:remainder: returns the remainder from devision
	 */
	public static void main(String[] args) {
		int a=100;
		int b=a-400;
		System.out.println(b); //300
		
		int c= a+b;
		System.out.println(c); //500
		
		int x=3, y=5, z=x*y;
		System.out.println(z); //15
		
		double length=100, width=10,area=length/width;
		
		System.out.println(area); //10.0
		
		//double rnum=9/0; // okuyamaz. denominator can not be zero
		
		short number1=10/3;
		System.out.println(number1); // short oldugu icin 3 oluyor. 3,33 falan degil direk 3.
		
		double number2=10/3;
		System.out.println(number2); //3.0// burada sistem 10 ve 3 u int number olarak algiliyor. eger ki 10.0, 3.0 veyaaaaa 10f,3f yaparsak o zaman 3.333 verir
		
		int number3=12+6/3;
		System.out.println(number3); // burada 14 oluyor, islem onceligi
		
		// int num1 int num2, int num3  hepsinin basina int yazarsak hata verir.
		
		/*
		 10/3===> 3 with reaminder of 1
		 12/5===>2 with remainder of 2 (12-2*5)
		 
		 */
		
		int result1= 10%3; // islem onceligi var. carpma bolme ile ayni yetkide
		System.out.println(result1); //1
		System.out.println(12%5);    //2
		
		System.out.println(20%3); //2
		
		System.out.println(20%2); // 0
		
		System.out.println(4+17%2-1); // burada ,once 17/2 cozuluyor, 4+1-1 oluyor
		
		
	}

}
