package day20_JavaRecap;

public class StringMethods {
	public static void main(String[] args) {
		
	
/*
 Methods: substring, indexOf, lastIndexOf, replace, replaceFirstequals, equalsIgnoreCase, contains, startsWith,
 endsWith, charAt, trim, length, 
 */
	
	/*
	 substring: creating the sub value of the String
	 */
	
	String str="Cybertek School";
	System.out.println(str.substring(0,str.indexOf("k")+1)); // burada sadece Cybertek yazdik/ 
	//														sondakine +1 yaptik cunku onu saymiyor
	
	String str2="Cybertek School";
	System.out.println(str.substring(str2.indexOf("S")));// burada sadece School yazdik. bu yazili yerden baslar
	
	/*
	 index of:returns the first occured values index number
	 */
	
	String s1="Java is very fun language, very good java";
	System.out.println(s1.indexOf("a"));// ilk a yi buldu
	
	System.out.println(s1.indexOf("ag")); // languAGe kelimesindeki a'nin degeri
	
	/*
	 lastIndexOf:returns the last occured chars index number
	 
	 */
	
	System.out.println(s1.lastIndexOf("a"));// en sondaki a'yi bulduk.
	
	System.out.println(s1.lastIndexOf("ava"));// sondaki jAVA kelimesindeki ilk A'yi bulduk
	
	/*
	 replace:replaces all the old value with the new one
	 
	 */
	
	String name="Cybertek School Batch 12";
	int length=name.length();
	System.out.println(length);//24
	
	name=name.replace(" ",""); // bosluk siliyoruz
	System.out.println(name.length());// 21 oldu, cunku bosluklari sildik
	
	name=name.replace("e","a");
	System.out.println(name);// e leri a ile degistirdik
	
	
	//replaceFirst: replaces the first occured old character with the new one
	
	String A1="Java is fun, java is object oriented";
	A1=A1.replaceFirst("Java","C++");
	System.out.println(A1);// replace first ilkini degistirir, replace hepsini degistirir
	
	/*
	 == , equals , equalsIgnoreCase
	 */
	
	String r1="Cybertek"; // String poolda saklanir
	String r2=new String ("Cybertek"); // Heap memoryde saklanir
	String r3=new String ("cybertek");
	
	System.out.println(r1==r2);// false cunku baska hafizalarda
	
	System.out.println(r1.equals(r2));// TRUE cunku sadece VISIBLE TEXTE bakiyor
	
	System.out.println(r1.equals(r3));//FALSE cunku	 CASE SENSITIVITY
	
	System.out.println(r1.equalsIgnoreCase(r3));//TRUE, SADECE VISIBLE TEXTE BAKAR VE CASE SENTIVITY ONEMLI DEGIL
	
	/*
	 trim():remove the unused spaces
	 */
	
	String spaces="     M     ";
	spaces=spaces.trim();
	System.out.println(spaces); // M
	
	String N1="    ";
	N1=N1.trim();
	System.out.println(N1);
	
	String N2="Tomorrow is gonna be a great to tdo repl.it";
	N2=N2.trim();
	System.out.println(N2);// bu hic bir degisiklik yapmaz
	
	N2=N2.replace(" ","");
	System.out.println(N2);// ustteki cumlenin bosluksuz halini yazar
	
	//charAt():returns a specific character from the string
	
	String C1="Cybertek";
	// 		   01234567
	char ch=C1.charAt(4);
	System.out.println(ch); // r
	
	String C2="Please do more and more practices tomorrow";
	char ch2=C2.charAt(C2.indexOf("ow")+1);
	System.out.println(ch2); //ow +1 yaptik, boylece w nin kini buldum
	
	
	//startsWith - endsWith;
	
	String gmail="cyber@GMAIl.com";// burada buyuk yazdim
	gmail=gmail.toLowerCase();	// burada case sensitivity olayini bitirdim
	boolean r=gmail.endsWith("@gmail.com");
	System.out.println(r);// true
	
	
	// starts with wwww. and ends with.com
	
	String url="www.cyber@gmail.com";
	url=url.toLowerCase();
	if(url.startsWith("www.")&& url.endsWith(".com")) {
		System.out.println("its valid");} // its valid
	else {System.out.println("Not valid bro");}
	
	// contains: checks if the given value is contained in the String
	String salary="1000$";
	boolean A=salary.contains("$");// true
	System.out.println(A);
	
	
	// concat: ONLY CONCATS THE STRING VALUES
	
	String School="Cybertek";
	School=School.concat("School")+15;// 15 burada ekleniyor, CybertekSchool15 oluyor
	System.out.println(School);
	}
}