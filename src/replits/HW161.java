package replits;

public class HW161 {
	public static void main(String[] args) {
		
	}
	public double waterTax(double units)
	  {
	    double bill = 0.0;
	    if(0<=units && units<=50) {
	    	bill=(units*0.6);
	    }
	    else if(50<units && units<100) {
	    	bill=(units*0.9);   }
	    else if(100<units && units<150) {
	    	bill=(units*0.9+50);
	    }
	    else if(150<=units) {
	    	bill=(units*0.9+100);
	    }
	 
	    
	    
	    return bill;
	  }

	  
	}