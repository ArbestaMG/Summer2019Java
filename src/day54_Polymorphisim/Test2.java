package day54_Polymorphisim;

interface Inter1 {
	abstract void get();// bunlari asagida override etmezsek hata verir
}

interface Inter2 extends Inter1{
	abstract void find();
}
abstract class Abs1{
	abstract void real();
}
public class Test2 extends Abs1 implements Inter1,Inter2{
	
public static void main(String[] args) {
	
	Inter1 obj= new Test2();
	// burada interfaceyi Test2 classina implement ettik, bu yuzden obje olusturabiliriz
	obj.get();
	
	Inter2 obj1= new Test2();
	obj1.find();// bu turlerde sadece soldakinden biseyler cagirabiliriz.
	
	Abs1 obj2= new Test2();
	obj2.real();
}

	@Override
	public void get() {
		System.out.println("Test overrided");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void real() {
		// TODO Auto-generated method stub
		
	}
}

