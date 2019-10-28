package day21_Dowhile_WhileLoop;

public class do_While {
public static void main(String[] args) {
	
	/*
	 do{
	 	statement;
	 	}while(condition);
	 	
	 	// burada once statement run ediliyor, sonra conditioa bakiyor, eger ki dogruysa run etmeye devam
	 */
	boolean A=false;
	while(A) {
		System.out.println("Hello");// burada yazmiyor cuunku condition is false
	}
	
	do {
		System.out.println("Hello 2."); // bu cikiyor cunku do while
	}while(A);
	
	
	
	
	int x=2;
	do {
		x++;
		System.out.println(x++);
		if(x%2==0) {
			System.out.print(x+" ");	}
			x++;
	}while(x<=100);

	System.out.println();
	
	
	do {
		System.out.println("hello world");
		System.out.println("hey");
		break;// breakten sonra bir tane daha sout yazarsak kabul etmez
		
	}while(true);
	}
	
}

