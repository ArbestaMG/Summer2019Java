package day20_JavaRecap;

public class Warmup1 {

	 public static void main(String[] args) {
	        /*
	          1. find the sum of all the numbers between 1 to 1000
	          2. find the sum of all even numbers between 1 to1000
	          3. find the sum of all odd numbers between 1 to 1000
	         */
	        
	        // int sum =1+2+3+4=5...1000;
	        
	        /*
	            for( initialization; condition; iterator){
	            }
	            
	         */
	        // task01
	            int sum1=0;
	        for(int i = 1; i <= 1000; i++ ) { // i: 1~1000
	                sum1 += i;
	        }
	        
	        System.out.println("sum of all nums: "+sum1);
	        
	        
	        // task02
	        int sum2=0;
	        for(int i = 1; i <= 1000; i++ ) { // i: 1~1000
	            if( i%2 == 0) {
	                sum2 += i;
	            }
	        }
	        System.out.println("sum of all even nums: "+sum2);
	        
	        
	            int Sum2=0;
	        for(int i = 0; i <= 1000; i+=2 ) {
	            Sum2 += i;
	        }
	        System.out.println("sum of all even nums: "+Sum2);
	            
	        // Task03:
	        int sum3=0;
	        for(int i =1; i <= 1000; i++) {
	            if(i %2 ==1) {
	                sum3 +=i;
	            }
	        }
	        System.out.println("sum of all odd numbers: "+sum3);
	        
	        int Sum3 = 0;
	        for(int i =1; i <= 1000; i +=2 ) {
	            Sum3 +=i; 
	            
	        }
	        System.out.println("sum of all odd numbers: "+Sum3);
	        
	        
	        
	        
	        /*
	          1. find the sum of all the numbers between 1 to 1000
	          2. find the sum of all even numbers between 1 to1000
	          3. find the sum of all odd numbers between 1 to 1000
	         */
	        
	        int summ=0;
	        for(int i=1;i<=1000;i++) {
	        	summ+=i;
	        	 }System.out.println(summ);
	        
	        	 int summ1=0;
	        for (int i=0;i<=1000;i++) {
	        	if(i%2==0) {
	        		summ1+=i;
	        		
	        	}
	        }System.out.println(summ1);
	        
	        
	        int summ2=0;
	        for(int i=0;i<=1000;i++) {
	        	if(i%2!=0) {
	        		summ2+=i;
	        		
	        	}
	        }System.out.println(summ2);
	    }
	}

	
	
	

	
	

	

