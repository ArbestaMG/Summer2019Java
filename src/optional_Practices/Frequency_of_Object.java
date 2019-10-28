package optional_Practices;

import java.util.ArrayList;
import java.util.Arrays;
/*
 //	Write a return method that accepts an String ArrayList list A 
	//	and  a String variable B, and the returns the total number of 
	//	appearance of string B in the ArrayList A.
 
	//	EX:	
	//	if   ArrayList cars ===> {"Toyota", "BMW", "bMw", "TOYOTA", "ToYoTa", "Tesla", "TESLA", "tEsLa" };
	//	Frequency ( cars,  "toyota")  ===>  returns 3
	//	Frequency ( cars, "BMW") ===> returns  2
 */
public class Frequency_of_Object {
public static void main(String[] args) {

	ArrayList<String> cars = new ArrayList<>(Arrays.asList("Toyota", "BMW", "bMw", 
			"TOYOTA", "ToYoTa", "Tesla", "TESLA", "tEsLa"));
	
	int count = frequency(cars, "tesla");
	System.out.println(count);
}

public static int frequency(ArrayList<String> list, String one) {
	
	int count = 0;
	
	for(int i = 0; i < list.size(); i++) {
		if(list.get(i).toLowerCase().equals(one.toLowerCase())) {
			count++;
		}
	}
	
	
	
	return count;
}
}
