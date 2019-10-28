package replits;
import java.util.Scanner;
public class HW92 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    double m=n;
		    double total=1;
		  


	        for (double i = 1; i <= m; i++) {
	            total *= i;
	            
	        }
	      
	       

	        	System.out.printf("%.0f\n", total);
	    
	
		    
		    
}}
