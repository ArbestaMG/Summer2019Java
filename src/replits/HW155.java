package replits;
import java.util.*;
public class HW155 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	
	public  static void fib(int num) {
		
		  int a = 0, b = 0, c = 1;
		  
	        for(int i = 1; i <= num; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	         
	        }System.out.print(c+" ");
	    }
	
	
}
