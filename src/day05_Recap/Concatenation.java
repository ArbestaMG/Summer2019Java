package day05_Recap;

public class Concatenation {

	/*
	 String:represents the sequences of characters. used for storing text
	 	String values are surrendered by a double quote
	 	
	 Concatenation: combining, linking things together===>creates a string value
	 	We can contact any value to String. For numbers we donr need "", for alpahet we need ""
	 */
	
	public static void main(String[] args) {
		String str= "any text goes here";
		System.out.println(str);
		
		String str2="1";
		System.out.println(str2);
		
		System.out.println("Hello World");
		
		String Hello="Hello World";
		System.out.println(Hello);
		
		String myName="Cybertek"+ "School";
		System.out.println(myName);
		
		String Year="This is"+2019;
		System.out.println(Year);
		
		//Example;
		
		String name="Og"; //// og nin onune bosluk koyarsam, finalde aralarinda bosluk olur. veya is in sonuna koyarsak arada bosluk olur.
		System.out.println("My name is "+name);
		
		/*
		 cucumber is variable $
		 tomato is variablename $
		 */
		int cucumber=3; int tomato=5;
		System.out.println("cucumber is "+ cucumber+"$");
		System.out.println("tomato is"+ " $"+tomato);
		
		String newstr="100"+10;          // bu 10010 oluyor cunku bunlar metin gibi davraniyor, matematik islemi yapmiyorlar
		System.out.println(newstr);
		
		System.out.println(1+2+3);        // burada 6 oluyor cunku string degil
		
		System.out.println("1"+2+3);      // text once "12"3 oluyor sonra hepsini icine alip "123" oluyor
		
		//System.out.println("1"+1-3);      //it will become "11"-3 hata veriyor cunku textten -3 cikaramayiz
		
		System.out.println("Batch 12"+1+2); // Batch 1212 oluyor
		
		System.out.println(2-1+1+"4");
		System.out.println("Batch12"+(1+5)); // Batch126 oluyor cunku parantez tek bi eleman gibi dusunuluyor
		System.out.println(1+"123"+4+5);     //112345 oluyor
		System.out.println("123"+(4+5));  	 //1239
		System.out.println("123+4"+5);       //123+45
		System.out.println(1+("1"+2));	     //112
		System.out.println(4+3-(9+3));       //-5
		System.out.println((1+2)+"3"); 		 //33
		// System.out.println((1+2)-"5"); burada hata var cunku 3 ten bir metin(5) cikarilamaz.
		
		String Bookname= "i like the book called \' Game of Throne\'";
		System.out.println(Bookname);
		
		String Myinfo="my name is: \n\tCybertek";
			System.out.println(Myinfo);
			
		
			System.out.println('3'+3); // bu 54. '3' char value var ve degeri 51
			System.out.println("3"+3); // bu 33
			System.out.println("3"+'3'); // 33 if we concat char to the string, char is concated as character
			System.out.println(12+'3'); //63    if we concat char to number,represemting number of char will be real
			
			System.out.println(2+3); //5
			System.out.println("2"+3); //23
			System.out.println(2+"3"); //23
			System.out.println('2'+3); //53
			System.out.println('2'+'3');//101
			System.out.println("2"+'3');//23
			System.out.println('2'+"3");//23		
			
			
			System.out.println('7'+3); //58
			System.out.println('7'+"3"); //73
			System.out.println('7'+9); //64
			System.out.println("3"+('3'+9)); //360
			System.out.println("3"+('3'+'9'));

		
	}
}
