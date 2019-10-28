package day30_Wrapper;

public class Warmup {
public static void main(String[] args) {
	String real=removedup("aaabbbccc");
	System.out.println(real);
	
	System.out.println(uniqvalue("abbbcddeef"));
	// degerleri tek tek bulduk, sadece uniq degerleri bulduk
	
}

public static String removedup(String str) {
	String empty="";
	
	for(int i=0;i<str.length();i++) {
		if(!empty.contains(str.substring(i,i+1))) {
			empty+=str.substring(i,i+1);
		}
	}
	return empty;}

public static String uniqvalue(String str) {
	String empty="";
	
	for(int j=0;j<str.length();j++) {
		int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.substring(j,j+1).equals(str.substring(i,i+1))) {
			count++;}
		}
	if(count==1) {
		empty+=str.subSequence(j, j+1);
	}
	}
	return empty;
}
}
