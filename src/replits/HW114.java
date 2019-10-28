package replits;
import java.util.*;


public class HW114 {
	public static void main(String[] args) {
		
	

	   Scanner input = new Scanner(System.in);
	   int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
			   input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

	   Arrays.sort(nums);
	   String str="";
	   for(int i=0;i<nums.length;i++) {
		   int count=0;
		for (int j=0;j<nums.length;j++) {
			if(nums[i]==nums[j] ) {
				count++;}
	
			}
			if(count==1) {
				str+=nums[i];
			  
		   }
		   
	   }System.out.println(str);
	
	   
	   
	}
	
	}
