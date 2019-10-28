package replits;
import java.util.*;
public class HW115 {
	public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		}
		  
		  String longest="";
		  String real=Arrays.toString(words);
		  
		  for(int j=0;j<words.length;j++) {
			  if(words[j].length()>longest.length()) {
				  longest=words[j];
			  }
		  
}System.out.println(longest);
}
}