package replits;
import java.util.Scanner;
public class HW89 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String test="";
	   for(int i=0;i<count-1;i++) {
		   test+=(word+separator);
	   }
	   String test1=test+word;
	 System.out.println(test1);
	    
	  
		
		
		
		
	}

}
