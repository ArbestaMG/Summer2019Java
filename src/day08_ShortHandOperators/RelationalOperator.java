package day08_ShortHandOperators;

public class RelationalOperator {
	/*
	 Relational Operators:
	 >  : greater than
	 >= : greater than or equal
	 <  : less than
	 <= : less than or equal
	 == : equal
	 != : not equal
	  
	 =  : assign
	 !  :esclamation mark in java means logical opposite
	 */
public static void main(String[] args) {   
	
	System.out.println(10>9); // true
	boolean resultA=10>9;
	System.out.println(resultA); //true
	
	System.out.println(10>=9); // true coz one of the condition works(greater or equal)
	boolean resultB= 10>=9;
	System.out.println(resultB); //true
	
	boolean resultC=10<=9;
	System.out.println(resultC ); // false
	
	boolean resultE= 1000<1000;
	System.out.println(resultE);  //false
	
	boolean resultF= 1000<=1000;
	System.out.println(resultF);  //true
	
	// == 
	
	
	boolean resultG= 19==19;
	System.out.println(resultG); //true
	
	// ! = tam tersi , not for numbers just for boolean (not olarak okuyabiliriz)
	
	boolean resultH= 20!=20;
	System.out.println(resultH); //false
	
	boolean A=true==!false;
	System.out.println(A);  // true
	
	boolean B= !false;
	System.out.println(B); //true
	 
	boolean C=!true;
	System.out.println(C); //false
	
	/*
	  in java
	  true== true , false == false
	  !false = true, !true= false
	  !false is not equal to !true
	  true equal !false
	 */
	boolean D=!false !=!true;
	System.out.println(D);   //true
	boolean E= true==!false;
	System.out.println(E);  //true
	boolean F=true ==!false;
	System.out.println(F); //true
	boolean G= !(!true);
	System.out.println(G); //true
	boolean H=10>9==9<10;
		//    true== true
	System.out.println(H);  //true
	
	
	// practice !(not);
	boolean g=false;
	System.out.println(!g);  //true
	
	System.out.println(!true==false);  // true
	
	boolean K="Batch12"=="Batch13";  // false
	System.out.println(K);
	
	System.out.println("Batch12"=="batch12"); // false coz java is key sensitive
	
	System.out.println("cybertek"!= "club");  // true   //  =! veya ==
	
;
	
}
}
