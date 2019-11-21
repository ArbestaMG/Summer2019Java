package day47_Java_Recap;

class Mehmet{
    
    public Mehmet(int a) {
    	System.out.println("int consu");
    }
}
class Resul extends Mehmet{

	public Resul(int a) {
		super(a);
		
	}
   
    
}
class Viktoria extends Resul {
    
    public Viktoria() {
        super(0);
        System.out.println("Viktoria");
    }
    
}
public class Constructors {
    
    public static void main(String[] args) {
        
        Viktoria obj = new Viktoria();
        
        
    }
}