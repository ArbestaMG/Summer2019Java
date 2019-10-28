package day17_StringClass;

public class StringMethods {
public static void main(String[] args) {
	//== 
	String str1="Hello Jave";
	String str2="Hello Jave";
	
	boolean r1= str1==str2;
	System.out.println(r1); // true
	
	
	String str3= new String("Hello Jave");
	String str4= new String("Hello Jave"); 
	
	boolean r2= str3==str4;
	System.out.println(r2); // false
	
	/*
	 1)concat, length, charAt, toUpperCase, toLowerCase
	 
	 */
	String a="Cyber";
	
	a.concat("School");
	System.out.println(a);// burada hala cyber cunku yeni bir degere assign etmedik
	
	
	a=a.concat("School");
	System.out.println(a);// burada cybershool cunku yeni bir degere assign ettik
	
	/*
	 length():it returns the total number of the characters as an int value
	 */
	
	String longname="abi";
	int num= longname.length();
	System.out.println(num);// 3 characters
	
	
	/*
	 charAt(indexNum): gives index number as a char value
	 */
	
	String name1="Muhtar";
	//			  012345
	char ch=name1.charAt(5); // aslinda muhtar 6 karakterli ama 6-1 yaziyoruz, cunku sayim 0 dan basliyor
	System.out.println(ch);//

	
	/*
	 toUpperCase(): hepsini buyuk yapar
	 
	 toLowerCase():hepsini kucuk yapar
	 */
	
	String name2="cybertek";
	name2.toUpperCase();//cybertek
	System.out.println(name2);// assign etmedigimiz icin hala kucuk
	
	name2=name2.toUpperCase();
	System.out.println(name2);// burada assign ettik o yuzden CYBERKTEK oldu
	
	String name3="CYBERTEK";
	name3.toLowerCase();
	System.out.println(name3);// burada assign etmedik o yuzden hala buyuk
	
	name3=name3.toLowerCase();
	System.out.println(name3);// burada assign ettik o yuzden cybertek oluyor
	
	
	/*
	 trim(): its used for removing the unused space
	 */
	
	String s1="         hello";
	s1.trim();
	System.out.println(s1); // hala bosluklu modelini veriyor cunku assign etmedik
	
	
	s1=s1.trim();
	System.out.println(s1); // bosluklari sildi, hello verdi
	
	String s2="Bizim       ev";
		s2=s2.trim();
	System.out.println(s2); // burada boslugu silmedi cunku boslugun yanlarinda sozcuk var
	
	/*
	 substring(beginnin index): it creates sub value of String from the beginning index till the last index
	 returns is as a NEW string value
	 */
	
	String Str1="Cybertek School";
	// 			0123456789
	String Str2=Str1.substring(9); //School
	System.out.println(Str2);// burada 9.degerden sonrasini aldi ve yeni bir string yapti
	
	
	String adres="Lex KY 40517";
	//			  01234567
	String zip=adres.substring(7);// burada zip kod 7.den itibaren basladi
	System.out.println(zip);
	
	
	/*
	 substring(begninnin index, ending index): it creates the sub value of the 
	 String from the beginning index till the ending index
	 (ending index num will be excluded)
	 then returns it as a NEW String value
	 */
	
	String name="Hello Cybertek School";
	//           0123456789...
	name=name.substring(6, 8);
	System.out.println(name);// Cybertek// burada 13+1 yaptik cunku ( normalde k nin degeri 13),
	//							cunku bu method son degeri okumuyor.
	
	
	String fullname="Cybertek School Batch12";
	//				 0123456789
	String middlename=fullname.substring(9,14+1);
	
	
}
}
