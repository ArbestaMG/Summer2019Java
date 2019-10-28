package replits;

public class HW143 {

	public static void printHollowRect()
	  {
		
		for(int i=0;i<5;i++) {
			if(i==0) {
				System.out.println("*****");}
			if(i>0 && i<4) {
				System.out.println("*   *");}
			if(i==4) {
				System.out.println("*****");
			}
			
		}
		
		
		
	   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
	  
	  
	  
	  
	
}
