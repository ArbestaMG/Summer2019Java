package replits;

public class HW195 {
	public static boolean isAnagram(String word1, String word2) {
		
		word1=word1.toLowerCase();
		word2=word2.toLowerCase();
		
		
		for(int i=0;i<word1.length();i++) {
			
		  for(int j=0;j<word2.length();j++) {
			  
			  if(word1.charAt(i)==word2.charAt(j)) {
				 word1= word1.replace(word1.charAt(i),'0');// burada ayni degerleri sifira esitliyorum
				  word2=word2.replace(word2.charAt(i),'0');// burada
			  }
			  }
		}   System.out.println(word2);
		System.out.println(word1);
		
		boolean A=false;
		if(word2.equals(word1)) {
			A=true;
		}
		else {A=false;}
		
		return A;
	  }
	
	public static void main(String[] args) {
		isAnagram("java","jattterer");
	}
	
}
