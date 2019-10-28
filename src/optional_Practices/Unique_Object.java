package optional_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Unique_Object {
	public static void main(String[] args) {
		
	/*
	 Write a program that can find the unique objects from an ArrayList

 

Ex: if arrayList is [100, 100, 20, 300, 300, 40, 500, 500]

output:    20   40 
	 */
		
		Integer[] arr= {100, 100, 20, 300, 300, 40, 500, 500};
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(uniq(list2));
		
	}

public static String uniq (ArrayList<Integer>list) {
	
	
	String uniq="";


	
	ArrayList<Integer>list2=new ArrayList<>();
	
	for(int i=0;i<list.size();i++) {
		int count=0;
		for(int j=0;j<list.size();j++) {
			if(list.get(i).equals(list.get(j))) {
				count++;
			}
		}
			if (count==1) {
				uniq+=(list.get(i)+" ");
			
			
		}
	}return uniq;
}
}