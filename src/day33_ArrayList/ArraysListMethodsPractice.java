package day33_ArrayList;
import java.util.ArrayList;
public class ArraysListMethodsPractice {

	public static void main(String[] args) {
		// set(index number, Object)L
		
		ArrayList<String> jave=new ArrayList<>();
		jave.add("Jena");
		jave.add("Eliz");
		jave.add("nene");
		jave.add("pepe");
		
		jave.set(1,"civani");
		System.out.println(jave);
		
		jave.remove(0);
		jave.add(0,"real first nameeeee");
		System.out.println(jave);
		
		//remove(int):removes the index number
		
		ArrayList<Integer>number=new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		System.out.println(number);
		number.remove(3);
		System.out.println(number);
		
		//remove(Object):
		
		number.remove("3");// bu ise yaramadi cunku number listemizde String 3 yok.
		System.out.println(number);
		
		Integer a=3;
		number.remove(a);
		System.out.println(number);// bu ise yaradi cunku integer 3 yaptim
		
		number.remove(Integer.parseInt("1"));// bu method primitive verdi// index no
		System.out.println(number);
		
		number.remove(Integer.valueOf("5"));// wrapper class verdi// first matching object
		System.out.println(number);
	}
}
