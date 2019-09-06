package day09_IfStatement;

public class review {
public static void main(String[] args) {
	
	boolean A=128>'9' || 128==127;  // 9 aslinda 9 degil57 ama ascii table da en buyuk 127 olduguna gore her turlu 127 den buyuk oluyor
	
	System.out.println(A);
	
	// 
	int z=100;
	boolean H=z>100;
	System.out.println("z>100 is:"+H);
	//
	
	
	/*
	 Relational
	 >   :
	 >=  :
	 <   :
	 <=  :
	 ==  : 
	 !=  :
	 
	 logical operators
	 &&  :
	 ||  :
	 
	 */
	

	System.out.println('z'>'a'); // true
	System.out.println('z'>='a'); // true
	System.out.println('a'>'A'); //true
	
	System.out.println(false==false); // true
	System.out.println(!(false!=true)); // false
	
	byte X=10; int Y=10;
	System.out.println(X==Y); // true
}
}
