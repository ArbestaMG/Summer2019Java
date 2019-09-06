package day03_variables;

public class PrimitiveDataTypes {
/*
 byte: only whole numbers.Range   -128<= byte <= 127
 short: only whole numbers. Range -32768<= short <=32767
 int:only whole numbers. 
 long:only whole numbers. We can put l or L at the end of the value.
 float: we can assign decimals. We must put f or F to the end of number.
 double: wecan assign decimals
 
 small one can be assigned to larger one
 
 We use _ for the big numbers. 1_000_000 means one million. It is easier to read.
 */
	
	public static void main(String[] args) {
		byte length= 3;
		System.out.println(length);
		
		byte width=4;
		System.out.println(width);
		System.out.println("========");
		// byte 9num=100; variables names must start with a~z, or A~Z
		
		byte num_and$=90;
		 //byte length =6; variable name is not unique
		
		//byte public=10; variable name can not be java reserved words
		//byte myNum1= -129; out of byte range
		//byte myNum2= 127: inside the byte range
		
		long longnumber= 10l;
        int intnumber= 10;
        // lond 10l but int 10;
		
		byte bytenumber= 10;
		short shortnumber= bytenumber;

		short shortnumber2=18;
		//byte bytenumber2=shortnumber2; short is greater than byte (bu olmuyor cunku byte 1 byte alabiliyor)
		
		int intnumber1= -19876;
		long longnumber2= intnumber1; 
		// long is greater than int
		
		short shortnumber3= -3000;
		int shortnumber4= shortnumber3;
		
		System.out.println(shortnumber4);
		System.out.println("=======");
		
		// int examplenum1= 10.5; this will not be okey
		float examplenum1= 10.5f ;
		float examplenum2= 10F;
		
		double doublenumber1=10.5;
		//float floatnumber123= doublenumber1; is not accepted because double is bigger than float
		
		byte bNum= 10;
		short sNum=20;
		int iNum=30;
		long lNum=40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println("=======");
		
		float fNum= bNum;
		float fNum2= sNum;
		float fNum3= iNum;
		float fNum4= lNum;
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		System.out.println("======");
		
		float fNum5=99f;
		System.out.println(fNum5);
		// Here f did not appear. 99f not, 99 yes
		System.out.println("======");
		
		int iNum100=1000;
		short sNum75=75;
		double dNum10075= (iNum100/sNum75);
		System.out.println(dNum10075);
		// Here we did get a whole number because int and short is only whole numbers.
		
			
		
		
		

		 
		

		
		
				
		
	}
}
