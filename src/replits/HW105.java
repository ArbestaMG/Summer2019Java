package replits;
import java.util.Scanner;
public class HW105 {
	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		    String str="";
		    for(int i=0; i<words.length;i++) {
		    	str+=words[i].charAt(0);
		    	str+=words[i].charAt(words[i].length()-1);
		    	if(i==4) {
		    		break;
		    	}
		    	str+=", ";
		    }System.out.println("["+str+"]");
		    
}}
