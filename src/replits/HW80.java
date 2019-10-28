package replits;

import java.util.Scanner;

public class HW80 {
public static void main(String[] args) {
    int freeBooks = 0;
    Scanner scan = new Scanner(System.in);
    boolean isPremiumCustomer = scan.nextBoolean();
    int nbooksPurchased = scan.nextInt();
    
    if(isPremiumCustomer==true) {
    	if(nbooksPurchased<5) {
    		freeBooks=0; System.out.println(freeBooks);
    	}
    	else if (nbooksPurchased>=5 && nbooksPurchased<8){
    	freeBooks=1; System.out.println(freeBooks);}
    	else if(nbooksPurchased>=8) {
    		freeBooks=2;
    	System.out.println(freeBooks);}}
    	
    else if(isPremiumCustomer==false) {
    	if(nbooksPurchased<7){
    		freeBooks=0; 
    		System.out.println(freeBooks); 
    	}
    	else if (nbooksPurchased>=7 && nbooksPurchased<12){
        	freeBooks=1; System.out.println(freeBooks);}
        	else if(nbooksPurchased>=12) {
        		freeBooks=2; System.out.println(freeBooks);}}
    	
    		
    	
    	
    
    }
    
    
    

}
