package day09_IfStatement;

public class IfStatement2 {
public static void main(String[] args) {
	String CEO="main boss";
	String Kuzzat="mains";
	System.out.println(CEO==Kuzzat);
	
	if (Kuzzat==CEO) {
		System.out.println("Great Person");
		System.out.println("First if block");
		}
	if(Kuzzat != CEO) {
		System.out.println("Great Person");
		System.out.println("Second if block");}
	
	double TotalNumber=100;
	boolean Cybertek=true;
	boolean bestschool=true;
	
	if(Cybertek==bestschool) {TotalNumber +=500;}
	if (Cybertek != bestschool) {TotalNumber -=50;}
	System.out.println(TotalNumber);
	
	
	
	int Y = 23456780;
    if( Y % 5 ==0 ) {
        //
        System.out.println(Y+" can be devided by 5 \n\n");
    }
    
    if( Y % 5 != 0 ) {
        System.out.println(Y+" can't be devided by 5 \n\n"); }  
    
    //
    byte PersonAge=12;
    byte voteAge=18;
     if (PersonAge>=voteAge) {
    	 System.out.println("Yes you can");
    	 System.out.println("vote for president");     }
    if (PersonAge<voteAge) {
    	System.out.println("No you can not");
    	System.out.println("vote for president");
    }
    	

}}

