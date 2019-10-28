package day17_StringClass;

public class StringMethods2 {
 public static void main(String[] args) {
	
	 /*
	  replace(old char, new char): replaces all old ones with new ones  and it makes NEW char value
	  
	  */
	 
	 String str1="Java is fun programming language";
	 
	 str1=str1.replace('a','e');
	 System.out.println(str1); // jeve is fun progremming lenguege
	 
	 
	 /*
	  replace(old str,new str): replace all str ones with new ones and it makes NEW string value
	  */
	 String str2="today is gonna be a great day to learn java";
	 str2=str2.replace("today","everyday");
	 System.out.println(str2); // burada kelimeleri degistirdik
	 
	 str2=str2.replace("java", "");
	 System.out.println(str2);// javalari boslukla degistirdik, yani sildik
	 
	 /*
	  replaceFirst(): replaces the first ones
	  */
	 String str3="java is fun, java is good, java is baby";
	 str3=str3.replaceFirst("java", "python");
	 System.out.println(str3);// burada sadece ilk javayi degistirdik
	 
	 str3=str3.replace("is good", "iz fireeee");
	 System.out.println(str3); // burada metindeki bir bolumu degistirdik
	 
	 String str4="java is programming language, java is java";
	 str4=str4.replace("java", "c#");// burada butun javalari degistirdik
	 System.out.println(str4);
	 
	 
	 String str5="java is programming language , java is java";
	 str5=str5.replace("java is ja"," computer is my lo");
	 System.out.println(str5);
}
}
