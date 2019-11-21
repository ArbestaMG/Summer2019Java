package day53_Interface;

interface B{
	void method3();
}						// burada impelemt kullanamayiz. ayni turde olunce extend, yoksa eimplement denir				
public interface extends_VS_Implements extends B {
		//         subtype              // super type
	void method1();//public
	void method2();//public
//  void method3();
	
	public void method3();
}
//abstract silersen ustteki methodlari override etmek gerekir
// silersem diye yaziyorum abstract class A..
class A implements extends_VS_Implements{

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	
	
}
