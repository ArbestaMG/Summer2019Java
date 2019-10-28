package day22_NestedLoop;

public class Nested_Loop {
/*
 for(5){
 			for(5) { 	"Hello" }
 			}
 			
 			burada hello 25 kere run olur
 */
	
	public static void main(String[] args) {
		
		for(int i=1; i<5;i++) {
			for(int z=1; z<=5;z++) {
			
			System.out.print(z);}
			System.out.println();}
	
		int l=5;
		while(l>0) {
			
		int k=1;
		while(k<=5) {
			System.out.print("*");
			k++;}
		
		System.out.println();
			l--;
	}
		System.out.println("\n");
		
		for(int i=1;i<=7;i++) {

			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
		int A=1;// initilaztion
		while(A<=7) {  // condition
			
		int B=1;
		while(B<=A) {
			
			System.out.print("&");
			B++;// iterator
		}
		
			System.out.println();
			
			A++;// iterator
		}
		
	
		}}
