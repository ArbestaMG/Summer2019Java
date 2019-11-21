
package day06_ArithmaticOperators;

public class PrimitiveCasting {
/*
 casting:converting larger primitive to smaller size. 
 	datatype variablename=(datatype)value
 		
 	castings:explivit and implicit
 	
 primitives: byte, short,int,long,float,double
 */
	//Explicit Casting:Bigger to smaller
public static void main(String[] args) {
	int a=10;
	byte b=(byte)a;
	System.out.println(b);	//10
	
	double dl1=10.5;
	float fl1= (float)dl1;
	System.out.println(fl1);	//10.5
	
	double dl2=10.5;
	float fl2= (int) dl2;
	System.out.println(fl2);	//10.0
	
	long lg3=300l;
	int in3=(byte)lg3;
	System.out.println(in3);
	// Implicit Casting:Smaller to Bigger
	
	byte byt5=100;
	int int5= byt5;
	// same with
	int int55=(int)byt5;
	
	
	
	
	int int6= (int)byt5;
	
	
	
	short sh7=100;
	long lg7= sh7; //implicit casting
	
	
	///Explicit Casting Practices:
	
	double large=100.8785;
	
	byte large1=(byte) large;   //100
		
	float flarge1=(float) large; //100.8785
	
	float flarge2=(int) large;
	float flarge3=(byte) large;
					//100.0
			
	float flarge4=(short) large;
	float flarge5=(long) large;
					//10.8765
			System.out.println(flarge1); 
			
			
			float fnumber1=500.67f;
			
			int inumber= (int)fnumber1;
			System.out.println(inumber);
			//burada short ve int kullanabiliuoruz. byte range kucuk diye kullanmiyuoruz. long da kullanmiyoruz.
			
			
			
			/*
			 int number1=100;
			 int number2=200;
			 int number3=300;
			 
			 */
			int num1=100, num2=200, num3=300;  // bu sekilde yaparak teker teker yazmak yerine daha kolay yaziyoruz. 
			
			System.out.println(num1+" "+num2+" "+num3);
			
			boolean result;
			//System.out.println(result); // henuz deger vermedik o yuzden okumuyor
			
			char char1='A';
			System.out.println(char1);
			
			boolean result1, 
			result2, 
			result3;
			
			//System.out.println(result1);
			
			
}}
