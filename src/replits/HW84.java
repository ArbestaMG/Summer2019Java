package replits;
import java.util.Scanner;

public class HW84 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    
  
    if(inhabitants==0) {
    	System.out.println("---- EXTINCT ----");
    }
    else {
    	
    	System.out.println("Day 0 ["+inhabitants+"]");
    for(int j=1;j<inhabitants;j++) {
    	
    for(int i=0;i<=inhabitants;i++) {
    	inhabitants=inhabitants/2;
    	System.out.println("Day "+j+++" ["+inhabitants+"]");}
    
    if(inhabitants==3) {
    	System.out.println("Day "+j+++" ["+(inhabitants-2)+"]");
	System.out.println("---- EXTINCT ----");}
    
  
    else if(inhabitants==2) {
    	System.out.println("Day "+j+++" ["+--inhabitants+"]");
    	System.out.println("---- EXTINCT ----");}
    
    else if (inhabitants==1) {
        	System.out.println("---- EXTINCT ----");
    }
  
    
        else {
    	System.out.println("---- EXTINCT ----");
    }
    
    
    }
}  
    
    
    
}
}
