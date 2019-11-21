package replits;

import java.util.Arrays;

public class Arrays_Copy_Certain_Values {
	  public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
			
			  int count=0;
		    for(int i=0;i<arr.length;i++) {
		    	  
		    	if(arr[i].contains("e")) {
		    		count++;
		    	}
		    }System.out.println(count);
		    
		    String []fewValues=new String[count];
		    System.out.println(fewValues.length);
		    int z=0;
		    for(int j=0;j<arr.length;j++) {
		    
		    	if(arr[j].contains("e")) {
		    	
		    	fewValues[z]=arr[j];
		    	z++;
		    	}	    
			
			  }
			return fewValues;
			  
			  
			  
			
		  }
		  }
