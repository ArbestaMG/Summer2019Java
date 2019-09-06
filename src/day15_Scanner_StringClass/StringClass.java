package day15_Scanner_StringClass;

public class StringClass {
public static void main(String[] args) {
	 
	String str1="cybertek";
	String A="cybertek";
	String B="cybertek"; //  bu 3u ayni hafizada saklaniyor. String pool deniyor. String pool does not take duplicates
	System.out.println(A==B);
	
	String str2=new String("cybertek"); // burada outside of the string pool but in java heap. not in the string pool
	System.out.println(str1==str2);// bu ikisi ayni yerde saklanmiyor// o yuzden false veriyor
	String str3=new String("cybertek");
	System.out.println(str2==str3);// burada string pool icinde saklanmiyor. new dedigimiz icin baska bi alanda saklaniyor.o yuzden false
	
	
	
	/*
	 1)String class: String is an object
	 				Two ways
	 				1= String literals
	 				2= by using new keyword
	 
	 when the object is reated by String literals, that object will be saved at String pool
	 
	 Heap:all the place where all the objects are store at
	 
	 String pool: located in the heap memory, stores all string literals object
	 
	 everyytime when we use new keyword, compiler will vreate a new object in java Heap memory
	 
	 
	 */
	
	String s1="cat";
	String s2="cat";// bunlar icin 1 memory kullaniliyor. string pool icinde
	System.out.println(s1==s2);// bu true gelir
	
	
	String s3=new String("car");
	String s4=new String("car");// bunlar baska memory locationlarda kullaniliyor.
	System.out.println(s3==s4); // false gelir
		
	System.out.println(s1==s4);// false .
	
	// buradan anliyoruz ki == aslinda hem anlamini hemde nerede saklandigini gosteriyor
	
	/*
	 2)String object represent the sequence of characters: "ABCDEFG"
	 each character in String has its own index number. index numbers star from 0
	 
	   String str="Cybertek"
	 index number: 012345678
	 */
	
	
	/*
	 3)String is immutable:
	 		once you declare it you can not modify it
		
	 
	 */
}
}
