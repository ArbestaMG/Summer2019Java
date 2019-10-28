package day30_Wrapper;

import java.util.ArrayList;

public class ArrayListClass {
/*
 ArrayList class:
 1)presented in java.util package
 		import java.util.ArrayList;
 		
 2)ArrayList does not support primitives

 3)similar to Arrat ArrayList we store objects ONLY\\
 
 4)ArrayList size is automatically adjusted(DYNAMIC)
 
 5)Arraylist is ordered(has index numbers)
 
	
	
	Decleration of arrayList:
		
		ArrayList<ClassType> variableName =new ArrayList<>();
		
*/
	
	/*
	 methods of Arraylist
	 -add(value): adds value to arrayList. Of the value is primitive will convert to wrapper class
	 
	 -get(indexNum): we get the specific value in the arraylist
	 
	 -size:length of the array list
	 
	 -clear: listedeki herseyi siler
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(10);// burada 10 aslinda int ama buraya yazinca wrapping oldu yani autoboxing yaptik
		list2.add(20);
		list2.add(30);
		
		System.out.println(list2);
		System.out.println(list2.get(1));// index number buyuk verirsek out of border olur
		System.out.println(list2.size());
		list2.clear();
		System.out.println(list2);
		System.out.println(list2.size());
	
	
	/* ARRAYLIST VS ARRAY 	DIFFERENCES
	 
	 1)Arrays size is fixed                                  Arraylist size is dynamic
	 
	 2)Array support primitive and non primitives            Arraylist supports does not support primitives
	 
	 */
	}
}
