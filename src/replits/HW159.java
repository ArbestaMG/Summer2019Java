package replits;

public class HW159 {
public static void main(String[] args) {
		
	}
	public String c_profits (int buyPrice,int sellPrice)
	  {
		String a="";
	 if(buyPrice>sellPrice) {
		 a+="loss";
	 }
	 else if(sellPrice>buyPrice) {
		 a+="profit";
		 
	 }
	   
	 else {
		 a+="no loss";
	 }
	   
	   return a;
	  }
	}