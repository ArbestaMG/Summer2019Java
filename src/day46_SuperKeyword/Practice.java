package day46_SuperKeyword;

class parent{
	public parent(int a) {
		System.out.println("int a constructor, not default");
	}
}
public class Practice extends parent {
//				sub            super

	public Practice() {
		super(10);// bunu yazarak usttekini cagiriyoruz
		
		System.out.println("B");
	}
	public static void main(String[] args) {
	 Practice obj=new Practice();
	}
	
	/*
	 public Practice(){
	 			super(); // bu yazdigimiz zaten hali hazirda var
	 */
}
