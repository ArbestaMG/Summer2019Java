package day22_NestedLoop;

import java.util.Scanner;

public class Warmup1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	
	/*
	  for(i=1;i<=30;i++) {
	 
	if(i%3==0 && i%5!=0){
		System.out.println(str1);}
	else if(i%5==0 && i%3!=0) {
		System.out.println(str2);
	}}
	*/
	String str="";
	int i=1; // baslangic
	while(i<=30) { // ust sinir
		if(i%3==0 && i%5==0) { // kosullar
			str+="FINRA"; 
		}else if(i%5==0) {
			str+="RA";
		}
		else if(i%3==0) {
			str+="FIN";
		}
		else {
			str +=i+" ";}
		
	// bu alttaki ek olarak yaptik, ustekinin ternary versioyonu	
		str+=(i%3 ==0 && i%5==0) ? "FINRA":
				(i%3==0)? "FIN": (i%5==0)? "RA" : i+"" ;
		i++;// durum
	}
	System.out.println(str);
	
	
	
	}
	}
	
	

