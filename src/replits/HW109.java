package replits;

public class HW109 {
public static void main(String[] args) {
	int k = 1;
    int total = 0;
    
    do {
    	total+= (k*k);
    	System.out.println(total);
    
    	k++;
    	
    	
    }	while(k<=50);
    System.out.println(total);
}
}
