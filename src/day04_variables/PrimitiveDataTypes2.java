package day04_variables;

public class PrimitiveDataTypes2 {
	/*
	 Primitives:  byte, short, int, long,float,double,boolen,char
	 
	 boolean: used for true or false
	 ASCI Table: a universal system that is recognized by all the computers. each character is represented
	 char: single character and we need to ''
	 
	 */
	public static void main(String[] args) {
		boolean result= true;
		boolean result2= false;
		boolean result3= 9>3;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		//char
		
		char char1='a';
		System.out.println(char1);
		// char char2='ab'; we can only give single character otherwise its gonna give error
		char char2='9';
		char char3='#';
		System.out.println(char2);
		System.out.println(char3);
		
		char char4= 67;   // if we use without '' and also its a number==> its gonna give me asci value(here is c)
		System.out.println(char4);
		
		char char5='c';
		System.out.println(char5); // prints the character as it is, so here is c
		
		char char6='{';
		char char7=123;
		System.out.println(char6);  // { olarak cikar
		System.out.println(char7);  // { olarak cikar 
		
		
		// initializing char to other primitives;
		
		char mychar1='b';
		
		int myint1=mychar1;
		 System.out.println(mychar1);  // b olarak cikar
		 System.out.println(myint1);   // 98 olarak cikar
		 
		// byte mybyte=mychar1; char takes 2 bytes but byte memory is 1 byte. 
		 byte mybyte2='b';
		 System.out.println(mybyte2);
		 byte mybb='r';
		 System.out.println(mybb);
		 
		 //short shortnum=mychar 1;  chars memory can be bigger than short and range is greater
		 
		 short shortnum2='q';
		 System.out.println(shortnum2); // b coreesponds 98 in ascii table
		 
		 long longnum1=mychar1; //long memory is 8 bytes
		 long longnum2='f';
		 System.out.println(longnum1);
		 
		 float floatnum1= mychar1;
		 float floatnum2='b';
		 
		 System.out.println(floatnum1);
		 System.out.println(floatnum2);
		 
		 double doublenum1=mychar1;
		 double doublenum2='r';
	
		 
		 System.out.println(doublenum1);
		 System.out.println(doublenum2);
		 
		 char mycharvalue=22;
		 System.out.println(mycharvalue);
		 
		 
		 
		 
		char ch11='a';
		System.out.println(ch11);
				
				
		
	}

}
