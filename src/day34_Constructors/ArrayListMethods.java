package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
/*
 remaining methods:

 indexOf(object) : returns the index number of the object ArrayList, returms int
 
 
 lastIndexOf();
 
 converting array to arrayList; Arrays.asList(Object Array):used for the converting object arrays to the list
 
 removeAll(),addAll();
 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);//autoboxing // cunku primitive wrappera assignladik
		System.out.println(list);
		list.add(Integer.valueOf("33")); // none
		list.add(Integer.parseInt("1000"));// autoboxing cunku primitive object yaptik
		list.add(200);
		list.add(50);
		list.add(1);
		
		System.out.println(list);
		// indexOf(object):returns the index number of the given object from the array list
		int a=list.indexOf(1);// 1 object oldugu icin onu inte assign ettik. autoboxing
		System.out.println(a);
		int b=list.indexOf(111);
		System.out.println(b);// burada -1 verdi cunku listemizde 111 yok.
		
		
		/// lastIndexOf(object): returns the last occured object index number(last index)
		int a3=list.indexOf(1);
		System.out.println(a3);
		int a4=list.lastIndexOf(1);
		System.out.println(a4);
		
		
		// Arrays.asList
		Integer[]arr= {1,2,3,4,5};
		
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
		list2.add(100);
		System.out.println(list2);
		
		String[]arr2= {"Java","Pyton","Pepe"};
		ArrayList<String>list3=new ArrayList<>(Arrays.asList(arr2));
		System.out.println(list3);
		System.out.println(list3.isEmpty());// empty olmadigi icin false verdi
		
		int[]arr3= {1,2,3,4,5};
		// bunu ceviremeyiz cunku only object array can be converted.
		
		
		//addAll(Interface):
		
		ArrayList<String>names=new ArrayList<>();
		names.addAll(Arrays.asList("Ali","Veli","Celi"));
		System.out.println(names);
		
		
		// removeAll(Interface): removees all the matching objects, it is not designed to be used in the loop
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(1,1,1,1,1,3,3,3,3,3,4,4,4,5,5,5,5,5,5));
		numbers.removeAll(Arrays.asList(1,3));// burada paranteze ne yazarsak onu siler
		System.out.println(numbers);
		
		ArrayList<Integer>lis=new ArrayList<>();
		lis.addAll(Arrays.asList(1,1,1,1,1,2,2,2,2,3,3,3));
		System.out.println(lis);
		for(int i=0;i<lis.size();i++) {
			if(lis.get(i)==1) {
				lis.remove(i);
			}
		}System.out.println(lis);// removeAll calismiyor, remove yazarsak bazilarini siliyor
		
		//arrayList sorting: ascendin order(artarak)
			Integer []array= {1000,900,800,700,650,2222,442,4409};
			ArrayList<Integer> price=new ArrayList<>();
		price.addAll(Arrays.asList(array));
		Collections.sort(price);
		System.out.println(price);
			
		
	}
	
	
}
