package replits;
import java.util.*;
public class HW119 {
	  public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
						scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

		
	  for(int i=0; i<temps.length;i++) {
		  total+=temps[i];}
	  avgTemp=total/(temps.length-1);
	  System.out.println(avgTemp);
	  }
	  
}
