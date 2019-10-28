package day21_Dowhile_WhileLoop;

import java.util.Scanner;
// ayni olanlari siliyoruz
public class Warmup {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	String s1="aabbcc";
	String result="";//abc
	
	
	for(int i=0;i<s1.length();i++) {
		if(!result.contains(s1.substring(i,i+1)) ) {
			//				(""+s1.charAt(i) // buda diger method
			result +=s1.substring(i,i+1);
		}
	}
	System.out.println(result);
	
	
	
	
	String s2="dddeeeefffr";
	String result2="";//abc
	
	
	
	for(int i=0;i<s2.length();i++) {
		if(!result2.contains(s2.substring(i,i+1))) {
			
			result2+= s2.substring(i,i+1);}
	}System.out.println(result2);
}
}
