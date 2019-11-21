package replits;

import java.util.ArrayList;

/*
 Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  
In other words, it is combining all the elements from the two parameters.
 */
public class HW187 {
public static void main(String[] args) {
	

}
}

class arraydeleter{
	
public static ArrayList<String>combineAl(ArrayList<String> wordList1,ArrayList<String> wordList2){
	
	wordList1.addAll(wordList2);
	return wordList1;
}
	
}