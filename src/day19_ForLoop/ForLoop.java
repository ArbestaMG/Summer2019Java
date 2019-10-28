package day19_ForLoop;

public class ForLoop {
public static void main(String[] args) {
	
	
	
	/*
	 loop:used for repeated actions, repeats the steps multiple times
	 
	 for(initialization; condition; iterator) }
	 	statements that we want to repeat
	 }
	 */
//	for( int i=1; i<=5; i++) {
//		System.out.println("value price is "+i );
//	}

/*
 	for loop: statements within loops body is repeated until condition becomes false
  	for loop: (for initialization; condition;iterator){
  	statements
  	}
  	
  	
  	initialization: usually the times of the number that we wanna execute the loop.Starting point
  	EX:   int i=0
  	
  	condition: is created based on initialization
  	EX:		i<10
  	
  	iterator: co-related to the condition, runs long enough and either incerases or decreases the 
  	value of the initialization, then eventually condition becomes false
  	ITERATOR IS NOT MANDATORY BUT IT WILL GIVE LOGICAL ERROR
  	EX 		i++
 */
	
	for (int i=1; i<=10;i++) {
		System.out.println("the square of " +i+" is "+ (i*i));
	}


}
}
