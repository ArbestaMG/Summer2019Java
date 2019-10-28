package day15_Scanner_StringClass;

public class StringMethods {
public static void main(String[] args) {
	 String str= "cybertek";
	// index num:01234567
	// charAt(index):// mesela charAt(1),yaptik bize y verir. buradaki net karakteri veriypr
	 System.out.println(str.charAt(4)); // buradan indexini bulabiliriz. burada cybertek yazdik. 7 harf var. 
	 // 7 ustu koyamayiz.
	 
	 char ch=str.charAt(0);
	 System.out.println(ch);
	 
	 String str2="Mu htar";
	  System.out.println( str2.charAt(2) );

	 
	 // length(): returns the total number of characters
	 
	 String name="Bebe";
	 System.out.println(name.length());
	 
	 // concat() it takes a String and concats into the String variable and returns into NEW String value
	 
	 String s1="eve gidiyorum";
	 s1=s1.concat(" simdi");
	 System.out.println(s1);// String is immutable , can not be changing. bu ikisini kombine etti
	 
	 //toUpperCase():butun harfleri buyuk yapar ve yeni bir string degeri yapar.
	 
	 String N="seni ozledim";
	 N.toUpperCase();
	 System.out.println(N);
	 N=N.toUpperCase();
	 System.out.println(N);
	 
	 
	 // toLowerCase(): converts to lowercase and then returns it as a New string value
	 
	 String name1="KAHVE";
	 	name1.toLowerCase();
	 	System.out.println(name1);// burada KAHVE oluyor. egerki bunu name1=name1.toLowerCase , o zaman kucuk yazar
	 	name1=name1.toLowerCase();
	 	System.out.println(name1); // kahve oluyor
	 	
	 	String name2="calismak lazimdir";
	 	System.out.println(name2.toUpperCase()); // burasi buyuk
	 	System.out.println(name2);// burasi kucuk, cunku name2 yu yeni bir name2.toUpperCase assign etmedik
	 	
	 	
	 	String f=name2.toUpperCase();
	 	System.out.println(f); // burada yeni bir string value tanimladim
	 	//indexOf():
	 	
	 	
			 
}
}
