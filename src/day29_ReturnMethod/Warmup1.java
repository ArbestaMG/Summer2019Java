package day29_ReturnMethod;

public class Warmup1 {
public static void main(String[] args) {
	
	/*
	 String write a method that can find the frequency of characters in String.
    Ex: 
        FrequencyTest("XXXYYYZZZ")
        output: X3Y3Z3
        FrequencyTest("AAABBBBBCCCC")
        output: A3B5C4



	 */
	String str="AAABBCCCCC";
	
	String removeDup="";
	for(int i=0;i<str.length()-1;i++) {
		if(!removeDup.contains(str.substring(i, i+1))) {
			removeDup+=str.substring(i,i+1);
		}
	}
	
	System.out.println(removeDup);// burada duplicateleri remove ettik
	
	
	for(int j=0;j<removeDup.length();j++) {
		int count=0;
	for(int i=0;i<str.length()-1;i++) {
		
		if(str.substring(j,j+1).equals(str.substring(i, i+1))) {
			count++;
		}
	}System.out.print(removeDup.substring(j, j+1)+count);}
	

	/*
	 2. METHOD
	 */
	
	String str1="ABBBCCCDEEEEFF";
	String result="";
	
	
	for(int j=0;j<str1.length();j++) {
	int count1=0;
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)==str1.charAt(j)) {
			count1++;
	}
		
	}
	result+=str1.charAt(j)+count1;
	str1=str1.replace(""+str1.charAt(j),"");
			
	}System.out.println(result);// bunda buglar var
	
}
}
