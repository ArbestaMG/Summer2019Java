package day05_Recap;

public class Primitives_Review {
	/*
	 Primitives:
	 	byte: only takes whole numbers
	 	short: only takes whole numbers
	 	int: only takes whole numbers
	 	long: only takes whole numbers
	 	
	 	
	 	float: whole numbers and decimals. when it takes decimals, we must put f-F to the end
	 	double: whole numbers and deceimals	
	 	
	 
	 	boolean: true or false boolean expressions
	 	char: characters within single quote
	 	
	 	Range= double>float>long>int>short>byte
	 	
	 */
public static void main(String[] args) {
	byte bNum=127;
	//byte range: -128to 127. we can not use decimals.
	
	
	short sNum2=10000;
	// short only takes  whole numbers
	// we can assign byte to the short.
	sNum2=bNum;
	System.out.println(sNum2);
	
	
	int intNum3=100;
	// onlu take whole numbers.
	// we can not assign int number into short or byte.
	System.out.println(intNum3);
	
	
	short sNum3=105;
	intNum3=sNum3; // bu durumda sout yaparsam intNum3 105 cikar, cunku java ustten okumaya basliyor.
	System.out.println(intNum3);
	
	
	
	long LongNum=100l;
	long LongNum2=100L;
	// L koyuyoruz cunku int ile ayirmak icin.
	
	//byte ByteNum3= LongNum;
	//short ShortNum4= 100l;
	//int IntNum3= 100l;		these are giving errors coz long>int,byte,short
	
	byte a=10;
	int b=30;
	short c=40;
	 	
	long LN=a;
	long LN2=b;
	long LN3=c;
	
	
	float fNum1= 10.5f; // sonuna f koymazsak hata verir.
	float fNum2= 10; //tam sayi oldugu icin sonuna f koymasak bile hata vermez
	
	 byte a1=10; short b1=20; short c1=30; int d1=40;
	 
	 float f1=a1;
	 float f2=b1;
	 float f3=c1;
	 float f4=d1;
	 //  System.out.println(f1); yaparsam 10.0 verir. 10 degil, 10.0
	 
	 
	 double dNum1=10l; // long is smaller than double
	 double dNum2= 10.5f;
	 
	 
	 boolean result= true;
	 boolean result2= false;
	 boolean result3= 9>10;
	 
	 char ch1='A';
	 System.out.println(ch1); // bu A olur.
	 // char ch2='aa' bu calismaz cunku tek karakter gerekli
	 
	// char ch3=a; '' olmadan calismaz
	 
	 char ch4=98;
	 System.out.println(ch4); // numaralar karaktere doner. bu b olur
	 
	 int num3='B';
	 System.out.println(num3); // bu 66 olur cunku int sadece rakam algilar. 
	 
	 float fnum='B';
	 System.out.println(fnum); // bu 66.0 olur
	 
	 byte bnum='B';
	 System.out.println(bnum); // 66 olur
	 
	 float fn1=5.5f;
	 float fn2=5;
	 System.out.println(fn1);
	 System.out.println(fn2);
	 
	 
	 
	 ////Practice
	 
	 
	 /*
	  8,   9,   #,   @,   8.5,   5.5f,   128,   40000,  9>10,   true,   false
	  
	  8= byte, short,int,long,float,double,char
	  
	  #,@=char
	  
	  */
	 	char Ch1='#';  // # verdi
	 	char Ch2='@'; // @verdi
	 	System.out.println(Ch1);
	 	System.out.println(Ch2);
	 	
	 
	 
	 
	
	
	char ch11='t';
	float fh1=ch11;
	System.out.println(ch11);
	System.out.println(fh1);
	
	
	
	char ch123=120;
	int i123=ch123;

	System.out.println(ch123);
	System.out.println(i123);
	
	char c1132=120 ;
			System.out.println(c1132);
	int i1231='a';
	System.out.println(i1231);

	
	char cc1='a';
	System.out.println(cc1);
	int ii1=a;
	System.out.println(ii1);
	
	
	
	
	
	
	
}
}
