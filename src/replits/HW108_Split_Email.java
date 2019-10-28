package replits;
import java.util.*;
public class HW108_Split_Email {
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    String email = input.nextLine();
    
    int count=0;
    for(int i=0; i<email.length();i++) {
	if(email.charAt(i)=='@') {
		count++;
		
	}
}
    if(count==1) {
    	String id=email.substring(0,email.indexOf("@"));
    	String domain=email.substring(email.indexOf("@"));
    	System.out.println("Email id: "+id);
    	System.out.println("Email domanin: "+domain);
    		
    	
    }
    else {System.out.println("invalid email");}
    
    
}
	
}
