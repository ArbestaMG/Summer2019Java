package day39_Review;

public class Constructors {
	public Constructors() {
		System.out.println("Default");// default
	}
	
	public Constructors(int a) {
		this();
		System.out.println("int one ");// default int one
	}
	public Constructors(double a) {
		this(1);
		System.out.println("Pepe");// default int one pepe
	}
	
	public Constructors(boolean a) {
		this(2.5);
		System.out.println("Delilo");// default int one pepe delilo
	}
public static void main(String[] args) {
	
	Constructors obj=new Constructors(true);
	
}
}
