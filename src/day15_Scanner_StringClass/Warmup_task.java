package day15_Scanner_StringClass;

import java.util.Scanner;

public class Warmup_task {
	
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	 System.out.println("enter a value");
	 int num=input.nextInt();
	 
	 String result="";
	 switch(num){
	 case 1:
	 result="one";
	 	 break;
	 case 2:
	 result="two";
	  	 break;
	 case 3:
		 result="three";
		 break;
	 case 4:
		 result="four";
		 break;
	 case 5:
		 result="five";
		 break;
	 case 6:
		 result="six";
		 break;
	 case 7:
		 result="seven";
		 break;
	 case 8:
		 result="eight";
		 break;
	 case 9:
		 result="9";
		 break;
		 default:
			 System.out.println("invalid");
			 break;}
	 
	 
	
			 System.out.println("you have entered"+result+".");
	
			 int num4 = -9;
		        String result4 = "";
		        if(num4 >=0 && num4 <= 9) {
		            
		            if(num4 == 9) 
		                    result="nine";
		            else if(num4 ==8)
		                    result ="eight";
		            else if(num4 == 7)
		                    result4 ="seven";
		            else if(num4 == 6)
		                    result4 = "six";
		            else if(num4 == 5)
		                    result4 = "five";
		            else if(num4 == 4)
		                    result4 = "four";
		            else if(num4 == 3)
		                    result4 = "three";
		            else if(num4 == 2 )
		                    result4 = "two";
		            else if(num4 == 1)
		                    result4 = "one";
		            else 
		                result4 = "Zero";      
		        } else {
		            result4 = "Invalid";
		        }
		        
		        
		        System.out.println(result);
		        
		        int n = 4;
		        
		        String result2 = n==9? "nine" :n==8? "eight" 
		                        :n==7? "seven" :n==6? "six"
		                        :n==5? "five"  :n==4? "four"
		                        :n==3? "three" :n==2? "two"
		                        :n==1? "one" :n==0? "zero" :"Invalid";
		        
		        System.out.println(result2);
	  
	 

}}
