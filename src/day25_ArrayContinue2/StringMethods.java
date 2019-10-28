package day25_ArrayContinue2;

import java.util.Arrays;

public class StringMethods {
	/*
	 split(str): splits the String by the given value and returns is as String arr
	 
	 toCharArray():
	 */
	public static void main(String[] args) {
		
		String sentence="Today is the gread day, good day to learn java";
				String[] arr=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		String email="FirstName_LastName";
			String[] arr2=email.split("_");
			
			String str=Arrays.toString(arr2);
			System.out.println(str);
			System.out.println(str.replace("[","").replace("]",""));
		
			String name="Cybettek School Batch12";
			String [] array1=name.split(" ");// two spaces but there words
			System.out.println(Arrays.toString(array1));
			
			String sentences="i love java and java is fun,java is life";
			String[] array2=sentences.split("java");// java splitting point
			System.out.println(Arrays.toString(array2));
			System.out.println(array2.length-1);// java kelimesi 3 kere gecmis oluyor// total index number
			
			
			String sentence1=" pyhton is good, i love pyhton, pyhton is my life ";
			String [] array3=sentence1.split("pyhton");
			System.out.println(array3);
			System.out.println(Arrays.toString(array3));
			System.out.println(array3.length-1);
			
			
			String email1="Cybertek_school_batch12@gmail.com";
			String fullname=email1.substring(0,email1.indexOf("@"));
			System.out.println(fullname);
			
			String[] allnames=fullname.split("_");//burada nokta koyduk ama calismadi , onun yerine\. koyabilirz
			System.out.println(Arrays.toString(allnames));
			
			String word="ABCDEFG";
			String[] allchars= word.split("");//burada bos biraktik ama  all charakterleri ayirir
			System.out.println(Arrays.toString(allchars));
			
			
			/*
			 toCharrArray():returns a char array from the String
			 */
			
			String Str="Java";
			char[] ch=Str.toCharArray();
			System.out.println(Arrays.toString(ch));
			
		
	}
}
