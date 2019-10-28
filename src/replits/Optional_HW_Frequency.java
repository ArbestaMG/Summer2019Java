package replits;

public class Optional_HW_Frequency {
public static void main(String[] args) {
	/*
	 Write a program that can find the frequency of characters in String
ex:

str ="AAABBCDDDDEE";
output:  A3B2C1D4E2
	 */
	

	String str="AAABBCCDDDEEE";
	
	String real="";
	
	for(int i=0;i<str.length();i++) {
		if(!real.contains(str.substring(i,i+1))) {
			real+=str.substring(i,i+1);
		}
	}System.out.println(real);
	
	
	for(int i=0;i<real.length();i++) {
		int count=0;
		String empty="";
		for(int j=0;j<str.length();j++) {
			if(real.substring(i, i+1).equals(str.substring(j,j+1))) {
				count++;}
		
			
		}empty+=real.substring(i,i+1);
		System.out.print(count+empty);
	}
	
			
		
		
	
}
}
