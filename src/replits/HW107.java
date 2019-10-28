package replits;
import java.util.*;
public class HW107 {
	public static void main(String[] args) {
		
		int count=0;
	  Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	   for(int i=0;i<nums.length;i++) {
		   if(nums[i]%2==0) {
			   count++;
		   }
	   }System.out.println(count);
}
}