
package day09_IfStatement;

public class If_Statement {
	/*
	 	if statement:
	 	
	 		if (boolean expression) { some codes to run}
	 		if block only gets executed if the condition is true
	 		// boolean dogru ise kod calisir
	 */
public static void main(String[] args) {
	if(11>3) {
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is day off");
	}
	
	int a=1000;
	if(a++ == 1001) { // post increment so, 1000=1000 so its false
		System.out.println("a is increased");}
		System.out.println(a);
		
		int X=92130;
		if (X%2==0) { // dogru oldugu icin calistiriyor
			System.out.println(X);
			System.out.println("its a even number");
			
			if (X%2!=0) { //false oldugu icin calistirmiyor
				System.out.println(X);
				System.out.println("its an odd number");}
				
				///
				
				
				int Y = 23456780;
		        if( Y % 5 ==0 ) {
		            //
		            System.out.println(Y+" can be devided by 5 \n\n");
		        }
		        
		        if( Y % 5 != 0 ) {
		            System.out.println(Y+" can't be devided by 5 \n\n");
		        }
		
		
				
			}

	
}
}
