package day07_Uneray_Shorthand;

public class UnaryOperators {
	public static void main(String[] args) {
		/*
		 +:positive
		 -:negative
		 ++:increment       // increases the value by 1
		 --:decrement		// decreases the value by 1
		 */	
		int b=-10;
		
		int c= +b;
		System.out.println(c); //-10
		
		int d=-c;
		System.out.println(d);//10
	
		//1)pre increment= operator placed before the variable. degerini hemen arttirir
			int num1=100;
			System.out.println(++num1); /// pre increment yaptik 1 artti.
			int num2=++num1; 
			System.out.println(num2); //102
		//2)post increment=operator placed after the variable. ilk seviyede 100 veriyor, bir dahakinda artmis gosteriyor
			int num3=100;
			System.out.println(num3++);//100
			System.out.println(num3);//101
			

			int num4=num2++;
			System.out.println(num4); //102
			
			int x=100;
			int y= x++ -1;
			System.out.println(y);  //99
			
			//decrement:decreases the value by 1
			
			//1)pre decrement=operator is placed before the variable. degerini hemen dusurur
			
			int z=100;
				System.out.println(--z); //99
				
			//2)post decrement= operator is placed after the variable.degerini hemen dusurmez.first current value, then decreases by one.
				
				int y1=95;
				System.out.println(y1--);//95
				System.out.println(y1);//94
				
				int t=25;
				System.out.println(++t);//26    // once 25+1 oldu=26.
				System.out.println(--t);//25	// bu seviyede 26-1=25 oldu. 
				
				//PRACTICE
				
				int p=50;
				p=--p + p++ + p-- + p++;
				//  pre post  post  post
				//  49 +49  + 50  + 49 
				System.out.println(p); //197
				
				
				//PRACTICE
				
				short s=4;
				int r=s*4-s--;
				//r=  16 - 4=12  // bu islemden sonra s artik 3 oluyor
				System.out.println(r);  //12
				System.out.println(s);	//3
				
				//PRACTICE
				
				int w=1;                    
				
				w= -w-- + w++ / -w--* --w;
				// post +post   post    pre
				// (-1)+ (0) / (-1)*(-1)
				System.out.println(w);
				
				double sayi=40;
				System.out.println(sayi);
				System.out.println(sayi++);
				System.out.println(sayi);
			
				
			
	}

}
