package replits;

public class HW157 {

	  public int max(int x,int  max)
	  {
		  int real=100088655;
		  // 10>5
		  if(x>max) {
			  real=max;
		  }	// real=5;
		  else {
			  real=x;
		  }// 
		  
	    return real;
	 }
	public static void main(String[] args) {
	
		HW157 obj=new HW157();
		
		int gercek=obj.max(1,4);
		System.out.println(gercek);
	}
}
