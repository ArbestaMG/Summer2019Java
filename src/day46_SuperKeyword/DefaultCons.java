package day46_SuperKeyword;

class B{
	
	public B(int a) {
		System.out.println("default cons of class B, super class");
	}
}
public class DefaultCons extends B{

	public DefaultCons() {
		super(10);
		// burada gorunmeyen bi super var
		
		System.out.println("Sub");
	}
	public static void main(String[] args) {
		DefaultCons obj =new DefaultCons();
	}
}
