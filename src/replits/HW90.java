package replits;

import java.util.Scanner;

public class HW90 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String word=scan.next();
	

	int ntimes=0;
	for(int i =0; i<word.length()-3;i++) {// Cybertek
		if(word.substring(i,i+4).equals("java")) {ntimes++;}
		
	}
	System.out.println(ntimes);
}}
