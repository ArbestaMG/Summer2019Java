package replits;
import java.util.*;
public class HW102 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String[] str=sentence.split(" ");
    
    for(int i=str.length-1;i>=0;i--) {
    	System.out.println(str[i]);
    }
   
	
    
}}
