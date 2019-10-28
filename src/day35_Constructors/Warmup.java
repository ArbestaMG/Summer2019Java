package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {
/*
 Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer array and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer array and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		ArrayList<Integer>list=arrtoarrlist(arr);
		System.out.println(list);
		
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,333,3313,5676,1123457,6));
		System.out.println(max(list2));
		
		ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(1,333,4343,677,32334,667533));
		System.out.println(secondmax(list3));
		
		
		int[]numbers= {1,2,333,4,555,6,-121,-22};
		ArrayList<Integer>list4=arrtoarrlist(numbers);
		System.out.println(MinNum(list4));
		
		
		int[]numbers2= {100,444,3234,0,4,-3,-43214,-4421312};
		ArrayList<Integer>list6=arrtoarrlist(numbers2);
		
		 System.out.println(secondmin(list6));
	}
	//task01:
	public static ArrayList<Integer> arrtoarrlist(int []arr){
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int each:arr) {// burada arrays.toarraylist yapmadik cunku bu bizde primitive var.
				// o method saddece wrapper kabul ediyor
			list.add(each);// autoboxgin
		}
		return list;
	}
	
	//task02
	public static int max(ArrayList<Integer> list) {// parantez icindeki ne istedigi, disindaki ne verecegi
	int max=Integer.MIN_VALUE;
	
	for(int each :list) {//unboxing
		if(each>max) {
			max=each;
		}
		
	}
		return max;
	}
	
	
	//task3
	public static int secondmax(ArrayList<Integer> list) {
		int maxnum=max(list);
		Integer removenum=maxnum;// bunu yaptik cunku remove liste primitive girersek, index number siler.
		// ama biz eslesen degerin cikmasini istiyoruz o yuzden Integera cevirip verdik
		list.remove(removenum);
		
		int realmax=max(list);
		
		return realmax;
	}
	
//task4
	public static int MinNum (ArrayList<Integer> list) {
        int min  =  Integer.MAX_VALUE;
        
        for( int each : list ) {  // unboxing
            if( each < min ) {
                min = each;
            }
        }
    
    return min;
        
    }
	
	//task5
	public static int secondmin(ArrayList<Integer>list) {
		Integer firstmin=MinNum(list);
		list.remove(firstmin);
		int realsecondmin=MinNum(list);
		return realsecondmin;
	}
}