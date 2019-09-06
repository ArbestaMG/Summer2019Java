package day08_ShortHandOperators;

public class ShortHandOperators {
public static void main(String[] args) {
	
	/*
	 &&: and   ==> true && true== true. both conditions are true will return true. ikiside dogru olursa sonuc dogru olur yoksa yanlis
	 ||: or	   ==> herhangi biri dogruysa, dogrudur. ikiside yanlissa yanlistir.
	 */
	
	//&&
	
	boolean ResultA= 9==0 && "muhtar"=="good";
	//				 false	  false
	System.out.println(ResultA);  //false
	
	boolean ResultB= 8>5 && 7==(8-2+1);
	//				  true   true   . ikiside true oldugu icin sonut true
	System.out.println(ResultB);  // true
	
	boolean ResultC= !false !=true && !false ==!(!true);	
	// 			     true !=true  &&  true == !(false)
	//					false     &&		true
	System.out.println(ResultC); 
	
	// ||:
	
	boolean A="monday"=="funday" || 6==6;
	System.out.println(A); //true
	
	boolean B= true||false;
	System.out.println(B); // false
	
	boolean C=!(8>5)||!("today"!="friday");
	//			false || false
	System.out.println(C); //false
	
	boolean D= true && true || false;  //true
	System.out.println(D);
	
	boolean E= !(7>5  && 6!=5) && (9>5 || 10>4);
	System.out.println(E); //false
	
	boolean K= false!=!false;
	System.out.println(K);
	
}
}
