package replits;

public class HW166 {
public static void main(String[] args) {
	
}
	 public static String mergeStrings(String one, String two) {
		   int leng=0;
		   if(one.length()==two.length()) {
			   leng=one.length();
		   }
		   else if(one.length()>two.length()) {
				   leng=one.length();
			   }
		   
			   else {
				   leng=two.length();
			   }
		   
		    
		   String str="";
		   
		   for(int i=0;i<leng;i++) {
			   if(i<one.length()) {
				   str+=one.charAt(i);
			   }
			   if(i<two.length()) {
				   str+=two.charAt(i);
			   }
		   }
		return str;
		    
	  }
	}