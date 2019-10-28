package replits;
import java.util.Scanner;
public class HW62 {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		   
		    
		  
		String n1=word.substring(0,1);
		String n2=word.substring(word.length()-1);
		System.out.println(n1+n2);
		   
		  }
}
