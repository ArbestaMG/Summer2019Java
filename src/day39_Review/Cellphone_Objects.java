package day39_Review;

public class Cellphone_Objects {
public static void main(String[] args) {
	Cellphone celler=new Cellphone() ;
	
	String str=celler.brand="Myphone";
	System.out.println(str);
	
	System.out.println("=====");
	
	System.out.println(celler.color);// burada duz constructor ise girer
	
	celler.color="Red";
	//System.out.println(color);// bu calismaz cunku dogru assign etmedik
	System.out.println(celler.color);// yeniden assign ettigimiz icin constructor gitti
	System.out.println("====");
	
	
	System.out.println(celler.price);
	celler.price=1125;
	System.out.println(celler.price);
	System.out.println("====");
	
	
	celler.screen=15;
	celler.model="x5";
	System.out.println("====");
	
	
	celler.call(111222);
	celler.text(444);
	celler.takepic(4, "kopek");
	
	System.out.println("=====");
	
	Cellphone celler2=new Cellphone("Nokia",10,"black",	500,"6600");
		
	celler2.getinfo();
	
	Cellphone[]phones= {celler,celler2};	// 	CUSTOM CLASS ARRAYI YAPTIK
	System.out.println(phones[1].brand);
}
}
