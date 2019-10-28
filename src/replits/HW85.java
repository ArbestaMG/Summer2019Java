package replits;
import java.util.Scanner;
public class HW85 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			
			int i=1;
			while (true) {
		          System.out.println("Enter Item"+i+" and its price:");
		           item = scan.nextLine(); 
		           price = scan.nextDouble();
		                    scan.nextLine();
		          System.out.println("Add one more item?");
		          countinue = scan.nextLine(); 
		          shoppingListReport += "Item"+i+": "+item+" Price: "+price;
		          ++i;
		          
		          totalPrice += price;
		          if (countinue.equals("no")){ break;}
		          shoppingListReport=shoppingListReport.concat(", ");
		        }
		        
		        System.out.println(shoppingListReport);
		        System.out.println("Total price: "+totalPrice);
				
		
			
	}
	
}
