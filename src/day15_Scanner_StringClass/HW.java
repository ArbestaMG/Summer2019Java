package day15_Scanner_StringClass;
import java.util.Scanner;
public class HW {
	
	  public static void main(String[] args) {
	    //YOUR CODE HERE:
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter seconds:");
	    int inputSeconds=input.nextInt();
	    
	      int hours=(inputSeconds/3600);
	      
	      int minutes=(inputSeconds/60)%60;
	      
	      int seconds=(inputSeconds%60);
	      
	      
	      
	      System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
	    
	  
	}

}
