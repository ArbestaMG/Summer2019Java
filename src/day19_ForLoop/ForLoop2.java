package day19_ForLoop;

public class ForLoop2 {
public static void main(String[] args) {
	
	/*
	 * 	baslangic		kosul	  her seferinde uygulanan etken
	 for(initialization:condition:iterator){
	 statements we wanna repeat}
	 */
	// task 01
	//for (int i=1; i<=10;i++) {
	//	System.out.println("the square of " +i+" is "+i*i);
	// }
	
	// task 02
	//for(int i=1;i<=32;i++) { // tum cift sayilari yazdik
	//	if (i%2==0) {
	//	System.out.print(" "+i);}
		
	//}
	
	// task 03
	for(int i=0;i<=32;i++) { // tum tek sayilari yazdik,araya else yazdik
		if( i%2==1) {
		System.out.print(""+i);}
		else {System.out.println("yes");}
	}
	
	
	String str="Java is fun baby";
	//			0123
	//"avaJ"
	String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	String rev2="";
	for(int i=str.length()-1;i>=0;i--) {
		rev2=rev2+str.charAt(i);}
	System.out.println(rev);
	System.out.println(rev2);
	
	
	
	String str1="ali ata bak";
	for(int i=str1.length()-1;i>0;i--) {
		System.out.print(str1.charAt(i));
	}
	
}
}
