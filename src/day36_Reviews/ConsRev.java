package day36_Reviews;

public class ConsRev {
	
	public ConsRev() {
		System.out.println("default cons");	
	}
	
	public ConsRev(int a) {
		System.out.println("Cons with argument");
	}
public static void main(String[] args) {
	ConsRev obj=new ConsRev();
	
	ConsRev obj2=new ConsRev(1);

}}

