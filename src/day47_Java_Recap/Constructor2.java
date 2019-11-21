package day47_Java_Recap;



class Ali{
	public Ali(int a) {
		System.out.println("Ali'nin int cons");
	}
	public Ali(double b) {
		System.out.println("Ali'nin double cons");
	}
	public Ali(String str) {
		System.out.println("Ali'nin str cons");
	}
	public Ali() {
		System.out.println("Ali'nin def cons");
	}
}

public class Constructor2 extends Ali {

	public Constructor2() {
	super("A");}
	
	public static void main(String[] args) {
		Constructor2 obj= new Constructor2();
		
		
	}
}