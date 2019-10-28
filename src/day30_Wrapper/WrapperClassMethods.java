package day30_Wrapper;

public class WrapperClassMethods {
public static void main(String[] args) {
	//max_Value: returns the maximum value of the primitive
	int maximum=Integer.MAX_VALUE;
	System.out.println(maximum);
	
	double maxdouble=Double.MAX_VALUE;
	System.out.println(maxdouble);
	
	byte maxbyte=Byte.MAX_VALUE;
	System.out.println(maxbyte);
	
	char maxchar=Character.MAX_VALUE;
	System.out.println(maxchar);// karakter veriyor, numara degil
	
	
	//min_Value: returns the minimum value of the primitive
	
	int minimum=Integer.MIN_VALUE;
	System.out.println(minimum);
	
	byte minbyte=Byte.MIN_VALUE;
	System.out.println(minbyte);
	
	//parse methods: converting a string value to a primitive

	// parseInt("strValue"): takes the String and converst the string to int primitive
	Integer num1=Integer.parseInt("123");// autoboxing
	System.out.println(num1+1);//1 ekliyoruz cunku number ise 1 artar. text ise devamina 1 eklenir
	
	int num2=Integer.parseInt("125");// autoboxing veya boxing yok cunku pri==pri yapiyruz
	System.out.println(num2+1);
	
	///parseByte("strValue"):takes the string and conver the string value to byte
	int num3=Byte.parseByte("11");
	System.out.println(num3); //none
	
	Byte num4=Byte.parseByte("18");//auto boxing // soldaki Wrapper, sagdaki primitive.Primitivei
	System.out.println(num4);//															wrappera assign ettik
	
	
	//parseShort("strValue"):takes the string and converts it to short primitive
	
	short num5=Short.parseShort("200");
	System.out.println(num5);// bu bir number
	
	//parseLong("strValue"): takes the string value and converts to long primitive
	
	int num7=(int)Long.parseLong("1222");// burada explicit casting yaptik. ve devaminda boxing falan yok.
	System.out.println(num7);
	
	
	
	//parseFloat("strValue"):takes the string value converst to float promitive
	
	float num9=Float.parseFloat("13");
	System.out.println(num9+1);
	
	Float num10=Float.parseFloat("12.5f");// burada f verebiliriz ama Long da L veremiyoruz
	System.out.println(num10+1);// autoboxing
	
	
	//parseDouble("strValue"):
	
	double num11=Double.parseDouble("20d");
	System.out.println(num11);
	
	//parseBoolean("strValue"): takes string value and converst it to boolean
	
	boolean A=Boolean.parseBoolean("CybertekBatch12");
	System.out.println(A);// true yerine ne yazarsak yazalim, false verir
	
	boolean B=Boolean.parseBoolean("TRUE");
	System.out.println(B); // buyuk yazsak bile true kabul eder
	
	
	boolean C=Boolean.parseBoolean("10>9");
	System.out.println(C);// false cunku bu sadece bir string 
	
	Boolean D=Boolean.parseBoolean("truE"); // auto boxgin
	System.out.println(D);
	
	
	int a=10;
	double b=a;
	// Double c=a;// bu olmaz cunku double wrapper is only for double primitive
	
	int A1=Byte.parseByte("19");
	Integer A2=(int)Byte.parseByte("19");//BURADA CASTING YAPTIK CUNKU OBUR TURLU CALISMAZ
	
	
	// Short A3=(byte)Double.parseDouble("10.9");//		BURADA DA OLMUYOR CUNKU SHORT A3 ASLINDA OLABILIR AMAAA
	//SHORT A3 SADECE SHORT ALIR, BYTE OLDUGU ICIN ALAMAZ. ALABILIR GIBI DURUYOR AMA ALAMAZZZZZ.
	// EGER KI SHORT CASTING YAPMIS OLSAUYDIK ALIRDI
	Short A3=(short)Double.parseDouble(" 12");
	System.out.println(A3);
	
	int A5=100;
	
	}
}
