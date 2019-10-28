package replits;

import java.util.Scanner;

public class HW69 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    int i=0;
    if(word.length()%2==0) {
    for(i=0;i<=(word.length()-1)/2;i++) {
    	System.out.print(word.charAt(i))  ;}}
    else {    for(i=0;i<=(word.length()-2)/2;i++) {
    	System.out.print(word.charAt(i))  ;}}
    
    if(word.length()%2==0) {
        for(i=0;i<=(word.length()-1)/2;i++) {
        	System.out.print(word.charAt(i))  ;}}
        else {    for(i=0;i<=(word.length()-2)/2;i++) {
        	System.out.print(word.charAt(i))  ;}}
        
    
    
    

    
    
}
}
