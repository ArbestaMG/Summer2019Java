package replits;

import java.util.Scanner;

public class HW97 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    
    int n=0;
    int m=0;
    
    for(int i=0;i<sentence.length()-3;i++) {
    	if(sentence.substring(i,i+4).equals("java")) {n++;}
    	}System.out.println(n);
    for(int i=0;i<sentence.length()-5;i++) {
    	if(sentence.substring(i, i+6).equals("python")) {m++;}
    	 }System.out.println(m);
    	 
    	 if(n==m) {System.out.println("true");}
    	 else {System.out.println("false");}
    }
    
    
}
