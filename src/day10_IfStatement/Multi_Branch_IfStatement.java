package day10_IfStatement;

public class Multi_Branch_IfStatement {
	/*
	 if else if else;
	 
	 if(condition){ 
	 //A              if condition1 is true
	  }
	  else if (condition2){
	  //B             if condition1 is false and condition2 is true
	   }
	   else{
	   //C            if condition 1 and 2 are false
	    }
	   
	 */
	public static void main(String[] args) {
		if(true) {
			System.out.println("if block");	}
		else if(true) {
			System.out.println("else if block");	}
		else {
			System.out.println("else block");}
			
			/*
			 Task:
			 90<=Grade==> A
			 80<=Grade<90 ==>B
			 70=<Grade<80 ==>C
			 60=<Grade<70 ==>D
			 	else==>F
			 
			 
			 */
			
			
			int grade=70;
			if(90<=grade) {
				System.out.println("A");}
				else if(grade<90 && grade>=80) {
					System.out.println("B");}
				
				else if( grade<80 && grade>=70) {
					System.out.println("C");}
				else if (grade<70 && grade>=60) {
					System.out.println("D");}
				else {
					System.out.println("F");}
			
			//FIND THE BUG
			
			int grade2=77;
			
			if(grade2>=60) {
				System.out.println("D");}
			else if(grade2>=70) {
				System.out.println("C");}
			else if (grade2>=80) {
				System.out.println("B");}
			else {
				System.out.println("A");}
			// burada kodlar ust uste geliyor, duzgun bi siralama yapamamisiz.
			
			/*
			 Task02:
			 1. time 0-12 ==> good morning
			 2. time 12-15 ==> good afternoon
			 3. time 15-23 ==> good night
			 4. time 12==>good noon
			 */
			 double time=33;
			 if ( 0<=time && time<12) {
				 System.out.println("good morning bro");}
			 else if(12<time && time<=15) {
				 System.out.println("good afternoon maaan");}
			 else if (15<time && time<=23) {
				 System.out.println("good night honey");}
			 else   {
				 System.out.println("good noon");}
				 		
			
			 int num1 =30, num2=30, num3 =30;
		        
	            if( num1 > num2 && num1 > num3) {
	                System.out.println(num1+" is the bigger number");
	            }
	            
	            else if( num2 > num1 && num2 > num3){
	                System.out.println(num2+" is bigger number");
	            }
	            
	            else if(num3 > num2 && num3 >num1) {
	                System.out.println(num3+" is the bigger number");
	            }
	            
	            else if (num3 == num2 && num3 > num1) {
	                System.out.println(num3+" and "+num2+" are the bigger number");
	            }
	        
	            else if(num3==num1 && num3 > num2) {
	                System.out.println(num3+" and "+num1+" are the bigger number");
	            }
	            else if(num2 == num1 && num2 > num3) {
	                System.out.println(num2+" and "+num1+" are the bigger number");
	            }
	            else {
	                System.out.println("all of them are equal");
	            }
				 
				 }
				
	
				
			 }
			 
			

		
		
		
	


