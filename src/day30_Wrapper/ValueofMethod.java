package day30_Wrapper;

public class ValueofMethod {
public static void main(String[] args) {
	//ValueOf methods:converst String value to Wrapper class values,returns wrapper class values
	// bu wrapper verirken digeri primitive veriyor
	int z=Integer.valueOf("1234");// unboxing
	System.out.println(z+1);
	
	
	Integer z1=Integer.valueOf("222");// burada unbox falan yok
	
	Integer z2=(int)Integer.valueOf("3333");// autoboxing
	
	boolean result1=Boolean.valueOf("False");
	System.out.println(result1);
	
	
	
	boolean result2=Boolean.valueOf("tRUe");// case sensitive degil o yuzden 
	System.out.println(result2);
		
	
	

}
}
