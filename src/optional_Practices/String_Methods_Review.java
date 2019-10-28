package optional_Practices;

public class String_Methods_Review {
public static void main(String[] args) {
	//Start with memory
	String str1="home";
	String str2="home";
	System.out.println(str1==str2);// true
	
	//These 2 are saved in the same memory which is called String pool and it does not take duplicates
	
	String str3=new String("home");
	String str4=new String("home");
	System.out.println(str3==str4);// false
	
	// These 2 are saved in the heap memory which is outside of the pool thats why it is wrong
	
	
	System.out.println(str1==str4);// false
	//https://i.stack.imgur.com/BRUZb.png
	
	
	//Lets move to other methods;

	//length: helps us t find the length of the String. It starts counting with 1
	
	String real="Reality is";
	//			 12345678910	
	real.length();// it does not give me a value becasue i did not assign
	System.out.println(real.length());
	
	//indexOf: helps us to find the first index of the char value. It starts counting with 0
	String word1="home sweet";
	//            0123456789
	System.out.println(word1.indexOf('i'));//-1 because there is no i
	System.out.println(word1.indexOf('o')); 
	System.out.println(word1.indexOf('e'));//3 because it finds the first e
	
	// lastIndexOf: helps us to find last index of the char value
	
	String word2="home sweet home";
	System.out.println(word2.lastIndexOf('e')); //14
	// We have 4 e's but we found the index number of the last occured e
	
	//charAt: helps us the find the index number of specific char
	
	String word3="i need to study more";
	//            0123456789...
	System.out.println(word3.charAt(0));//i
	System.out.println(word3.charAt(3));//e
	
	System.out.println("=====");
	
	// concat: helps us to connect two Strings

	String word4="coffe";
	String word5=" is my fav";
	word4.concat(word5);// it did not give me a value because String is IMMUTABLE
	System.out.println(word4.concat(word5));// coffe is my fav
	
	String word6="i like";
	System.out.println(word6.concat(" tea also"));// i like tea also
	
	// toUpperCase: makes all String to upper case
	
	String case1="Thank yoU For AttEnding";
	System.out.println(case1.toUpperCase());// THANK YOU FOR ATTENDING
	
	//toLowerCase: makes all String to lower case
	
	System.out.println(case1.toLowerCase());// thank you for attending
	System.out.println("=====");
	//trim: is used for removing unused spaces
	
	String case2="today      is               amazing";
	System.out.println(case2);
	System.out.println(case2.trim());// it did not change because spaces are used
	
	String case3="      weather is getting cold               ";
	System.out.println(case3);// 
	System.out.println(case3.trim());// removed unused spaces
	
	
	//is empty:checks if the String is empty and returns boolean expressions
	String school="Cybertek";
	System.out.println(school.isEmpty());// false because it not empty
	
	
	String school1="";
	System.out.println(school1.isEmpty());// true because it is empty
	
	
	System.out.println("=====");
	
	//substring(beginnin index): it creates sub value of String from the beginning index till the last index
	// returns is as a NEW string value
	
	String case4="i need to study more java";
	//            0123456789...
	System.out.println(case4.substring(1));// deletes before the 1
	
	System.out.println(case4.substring(5)); // deletes before 5
	
	
	/*
	 substring(begninnin index, ending index): it creates the sub value of the 
	 String from the beginning index till the ending index
	 (ending index num will be excluded)
	 then returns it as a NEW String value
	 */
	
	String case5="United States Of America";
	//            0123456789..
	System.out.println(case5.substring(1,4));//  did not include the 4th value(e)
	
	System.out.println(case5.substring(0,6));// did not include the space at 6th
	
	System.out.println("=====");
	
	// replace(old char, new char): replaces all old ones with new ones  and it makes NEW char value
	
	String newstr1="English teacher needs to rest";
	System.out.println(newstr1.replace('e', 'a'));// changed the first e with a// case sensitive
	
	//  replace(old str,new str): replace all str ones with new ones and it makes NEW string value
	
	String newstr2="i need to study english, study java, study math, StudY more and more";
	System.out.println(newstr2.replace("study", "know"));
	
	 //replaceFirst(): replaces the first ones
	
	String newstr3="i love coffe and drink coffe two times every day, coffe is my fav, coffe is my drink";
	
	System.out.println(newstr3.replaceFirst("coffe", "Nothing"));// changed the first coffe
	
	// startsWith(str):checks if the String is started with the str or not, then returns boolean expression
	String newstr4="Coffe is my fav";
	System.out.println(newstr4.startsWith("c"));// false because it is case sensitive
	
	System.out.println(newstr4.startsWith("C"));// true
	
	
	//endsWith(str);checks if the String ended with the str.
	
	String newstr5="Java java java";
	System.out.println(newstr5.endsWith("A"));// false because it is case sensitive
	
	System.out.println(newstr5.endsWith("a"));// true
	
	
	System.out.println(" ");
	
	System.out.println("equals and ==");
	// equals(str):checks if the two String face values are equal
	
	String a1="cybertek";// pool memory
	String a2=new String("cybertek"); // heap memory
	String a3="cybertek";
	//As we see before "==" also  checks the memory location.
	System.out.println(a1==a2);// false because  "==" controls the memory
	System.out.println(a1==a3);//true;
	
	boolean B=a1.equals(a2);
	System.out.println(B);//TRUE because it just checks FACES
	
	System.out.println("java".equals("JAVA"));//False because case sensitivity
	System.out.println(" ");
	
	System.out.println("equalsIgnoreCase");
	// equalsIgnoreCase(str):checks if the two String face values are equal or not BUT NOT CASE SENSITIVE
	
	String s1="JAVA";
	String s2="java";
	System.out.println(s1==s2);// false, although they are in the same pool memory
	
	String s3=new String("JavA");
	System.out.println(s3.equalsIgnoreCase(s1));// true because just checks faces and no case sensitivi
	boolean C=s1.equalsIgnoreCase(s2);
	System.out.println(C); //TRUE
	
	// contains(str):checks if the str is contained in the String or not, gives boolean. 
	// if contains TRUE, or not FALSE
	System.out.println("");
	System.out.println("Contains");
	
	String name="Johny";
	System.out.println(name.contains("great"));// false
	// Johny does not contain great
	System.out.println(name.contains("ohn"));// true
	System.out.println("=====");
			

	String name2="Oguz";
	boolean F=name2.contains("Gu");
	System.out.println(F);//False because it is case sensitive
}	
}
