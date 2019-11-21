package replits;

public class HW186 {
	
	public static void main(String[] args) {
		Main obj=new Main();
		String str=Main.extractNum("123##$#222333==+++");
		System.out.println(str);
	}
	
	
	
}
	class Main {
		
		  public static String extractNum(String s) {
			  String str=" ";
		  for(int i=0;i<s.length();i++) {
			  if(Character.isDigit( s.charAt(i))) {
				  str+=s.charAt(i);}
			  
		  }
		   return str;
		  }
		}
