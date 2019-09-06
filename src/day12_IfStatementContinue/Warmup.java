package day12_IfStatementContinue;

public class Warmup {
public static void main(String[] args) {
	
	int num1=2;
	int num2=11;
	int num3=12;
	
	if (num1==num2 &&num2==num3)System.out.println("all are equal");
	else if(num1==num2) {
		System.out.println("num1=num2");}
	else if(num2==num3) {System.out.println("num2=num3");}
	else if(num1==num3) {System.out.println("num1=num3");}
	else {System.out.println("no equal");}
	
	
	int A=10,B=20,C=30;
	if(A==B &&B==C) {System.out.println("all are equal2");}
	else {
		if(A==B) {System.out.println("A=B");	}
		else if(A==C) {System.out.println("A=C");}
		else if(B==C) {System.out.println("B=C");		}
		else {System.out.println("noone is equal");}}
	
	
	
	/*
    
    60~70 => D
    70 ~ 80 => C
    80 ~90 => B
    90 ~ 100 => A  done
    0~59 =>F
     
     grade must be: 0~100
     */
    int grade =99;
if(grade >=0 && grade <= 100) {
    if(grade >= 60) {
        if(grade >= 90) {
            System.out.println("A");
        }
        else if(grade >= 80) {
            System.out.println("B");
        }
        else if (grade >=70 ) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }   
    }else {
        System.out.println("Failed");
    }
} else {
    System.out.println("Invalid Entry");
} 
    
		
		
	}
	}
	
	
    
   
			


