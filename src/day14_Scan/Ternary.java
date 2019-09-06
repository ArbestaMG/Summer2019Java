package day14_Scan;

public class Ternary {
public static void main(String[] args) {
	int num=0;
	if(true) {num=100;}
	else {num=50;}
	System.out.println(num);//100 olur
	
	/*
	 if(true)
	 	num=100;
	 else
	 	num=50;
	 */
	int num1=0;
	num1=(false)? 100:50;
	System.out.println(num1);//50 olur
	/*
	 if(condition) 	       ==> (Condition)?
	 else 		   		   ==> :
	 else if(condition 	   ==> :(Condition)? 
	 */

	String Schoolname="";
	boolean Batch=true;
	
	if (Batch) { Schoolname="Cyber";
	}else { Schoolname="invalid";}
	System.out.println(Schoolname); //cyber
	
	String Bestschool=Batch ? "Cybertek":"Novalido";
	System.out.println(Bestschool);//cybertek
	
	// in ternart total number of  ?==:
	
	double rate=0;
	boolean goodcredit=true;
	rate=(goodcredit==true) ? 0.5:0/9;
	System.out.println(rate);		
	
	
	byte grade=60;
	boolean Passed=grade>=60? true:false;
	System.out.println(Passed);
	
	char final1 = 'A';
	String group="";
	if(final1=='A') {group="early bird";}
	else if(final1=='B') {group="group1";}
	else {group="normal";}
	System.out.println(group);
	
	char finalgrade='A';
	String grup="";
	grup=(finalgrade=='A')?"early baby":(finalgrade=='B')?"first group":"basix";
	System.out.println(grup);
	
	
	char exam='R';
	String last="";
	last=(exam=='A')?"Master":(exam=='B')?"Second":(exam=='C')?"Third":"Study";
	System.out.println(last);
	
	int score=110;
	char finals='a';
	finals=(100>=score && score>=90)?'A'
			:(90>score && score>=80)?'B'
					:(80>score && score>=70)?'C'
							:(70>score && score>=69)?'D'
							:' ';
							System.out.println(finals);
		
						
	int n1=100, n2=400, n3=400;
	int max=(n1>n2 && n1>n3)? n1
			:(n2>n1 && n2>n3)? n2
			:(n3>n1 && n3>n2)? n3
				:0;
	System.out.println(max);

 String str="JAVA";
 System.out.println(str.toLowerCase());
 
 
 int num4 = 5;
 String number = (num4 == 0)? "zero" :(num4 == 1)? "one" :(num4 == 2)? "two" 
         :(num4 == 3)? "three" :(num4== 4)? "four" :(num4 == 5)? "five" 
         :(num4 == 6)? "six" :(num4 == 7)? "seven" :(num4 == 8)? "eight" 
         :(num4 == 8)? "eight" :"invalid entry";
System.out.println("You entered " + number + "." );

 

}
}
