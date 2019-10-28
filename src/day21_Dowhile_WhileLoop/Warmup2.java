package day21_Dowhile_WhileLoop;

public class Warmup2 {
// cumlede kac kere ayni kelimenin gectigini bulucaz. kelimemiz book
	
	public static void main(String[] args) {
		
		String sentence="I like books,i have so many books and books";
		//		index:		 	z,  z+4    
		
		int count=0;
		for(int i=0; i<sentence.length()-3;i++) {// burada-3 yaptik, cunku book kelimesi 4 harfli
			
			if(sentence.subSequence(i, i+4).equals("book")) {
				// substring(0,4)// burada 4 character var, endind index is excluded
				count++;
			}
		}
		System.out.println(count);
		
		
		
		String words= "Cybertek school is a nice Cybertek, i like Cybertek , yes school";
		int ntimes=0;
		for(int i =0; i<words.length()-7;i++) {// Cybertek
			if(words.substring(i,i+8).equals("Cybertek")) {ntimes++;}
			
		}
		System.out.println(ntimes);
		
		
		
		
		
		
		
		
		
		
		
		
		String ex="i love home, home is my fav, no place home, yes home";
		int num1=0;
		String real="home";
		
		
		
		for(int i=0;i<ex.length()-3;i++) {
			if(ex.substring(i,i+4).equals("home")) {
				num1++;
			}
		}System.out.println(num1);
	}
	
}
