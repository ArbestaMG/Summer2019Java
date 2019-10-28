package replits;
import java.util.*;
public class HW121 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String [] arr=str.split(", ");
		   
		    int minvalue=100;
		    String last="";
		    for(int i=0;i<arr.length;i++) {
		    	
		    	if(arr[i].length() < minvalue) {
		    		
		    		minvalue=arr[i].length();}
		    	
		    	//test data:ayi, veli, kirk, dok, ell, celi
		    }
		    
		    
		    for(int i=0;i<arr.length;i++) {
		    	if(arr[i].length()==minvalue) {
		    		last+=arr[i]+" ";
		    	}
		    }last=last.trim();
		   String[] arr1=last.split(" ");
		   Arrays.sort(arr1);
		   System.out.println(Arrays.toString(arr1));
		
		   
		  
}}
