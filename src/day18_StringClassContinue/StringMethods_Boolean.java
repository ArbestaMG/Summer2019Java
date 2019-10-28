package day18_StringClassContinue;

public class StringMethods_Boolean {
public static void main(String[] args) {
	
	/*
	 isEmpty():checks if the String is empty and returns boolean expressions
	 Bos olursa true diyor. Bos mu ???? 
	 */
	String str="Cybertek";
	boolean A=str.isEmpty();// bos olursa true. dolu oldugu icin false dedi
	System.out.println(A);
	
	String str2="";
	if(str2.isEmpty()) {System.out.println("Empty");}
	else {System.out.println("not empty");}
	

	/*
	 equals(str):checks if the two String face values are equal or not
	 */
	
	String a1="cybertek";
	String a2=new String("cybertek");
	System.out.println(a1==a2);// false
	
	boolean B=a1.equals(a2);
	System.out.println(B);//TRUE cunku sadece gorunusleri kontrol ediyor
	
	System.out.println("java".equals("JAVA"));//False cunku case sensitivity
	
	
	/*
	 equalsIgnoreCase(str):usttekinin aynisi fakat case sensitivity DEGIL
	 */
	String s1="JAVA";
	String s2="java";
	boolean C=s1.equalsIgnoreCase(s2);
	System.out.println(C); //TRUE
	
	/*
	 contains(str):checks if the str is contained in the String or not, gives boolean. if contains TRUE, or not FALS
	 */
	String name="muhtar";
	Boolean D=name.contains("good person");
	System.out.println(D); // false cunku muhtar texti icinde good guy yok.

	String name2="Oguz";
	boolean F=name2.contains("Gu");
	System.out.println(F);//False cunku case sensitive. 
	
	/*
	 startsWith(str):checks if the String is started with the str or not, then returns boolean expression
	 */
	
	String today="Java";
	boolean G=today.startsWith("J");
	System.out.println(G);// Java J ile basladigi icin true. bu da case sensitive
	
	String best="Java is my lifestyle";
	boolean K=best.startsWith("Java is");
	System.out.println(K);// string icinde kontrol edebiliriz
	
	
	/*
	 endsWith(str);checks if the String ended with the str.
	 */
	
	String case1="Today is Tuesday";
	boolean L=case1.endsWith("day");
	System.out.println(L);// True cunku day ile bitiyor
	
}
}
