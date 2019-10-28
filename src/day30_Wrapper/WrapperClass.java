package day30_Wrapper;

import java.util.Arrays;

public class WrapperClass {
/*
 	primitives						wrapper-class
 		byte							Byte			
 		short		   BOXING			Short
 		int				=====>			Integer	
 		long							Long
 		float							Float
 		double			AUTOBOXING		Double
 		boolean		     <=====	    	Boolean
 		char							Char
 		
 		
 		DEFAULT VALUE OF PRIMITIVE=
 		byte,short,int,long====>0
 		float,double           ====>0.0
 		boolean                ====>FALSE
 		char                   ====>Space
 		
 		Wrapper class default values are all=====> NULL. Hepsinde NULL oluyor.Stringde de NULL oluyor
 */
	
	public static void main(String[] args) {
		int numint=10;// bu primitive
		Integer numInteger=10;// bu wrapper class
		
		double numdouble=5.5;
		Double numDouble=5.5;
		
		long numlong=20L;
		Long numLong=numlong;// primitive i wrapper class a assign ettik.BOXING
		//Autoboxing= converting primitve values to Wrapper class
		
		System.out.println(numlong);
		System.out.println(numLong);
		
		
		Boolean Booleanresult=false;// wrapper class primitive assign ettik. // UNBOXING
		boolean booleanresult=Booleanresult;
		
		
		Integer [] arr=new Integer[3];
		System.out.println(Arrays.toString(arr));//int yazarsak bu==[0,0,0]/// Integer yazarsak bu==[null,null,null]
	
		String[]arr1=new String[3];
		System.out.println(Arrays.toString(arr1));//STRING OLMASINA RAGMEN NULL VERIYOR. STRING PRIMITIVE DEGIL
	
		int num1=10;
		//num1.method(); primitive variables does not have methods
		
		Integer num2=20;
		int x=num2.MAX_VALUE;// burada wrapper methodu kabul etti.
		
		/*
		 Useful methods of Wrapper class:
		 		Max_Value
		 		Min_Value
		 		parse methods
		 		ValueOfmethods
		 */
		
		
	}
}
