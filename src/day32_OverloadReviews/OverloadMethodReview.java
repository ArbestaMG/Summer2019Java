package day32_OverloadReviews;

public class OverloadMethodReview {
/*
 Overload method: improves the reusability
 				  improves the reusability
 				  felixble during runtime
 				  
 				  SAME METHOD NAMES BUT DIFFERENT PARAMETERS
 				  

 */
	public static void main(String[] args) {
		sum(10,30);
		sum(22.4,3413.4);
		sum(1,33,455);
		sum(3213,44,true);
		int total=sum(123,441.5,(byte)111);// burada byte yazdik cunku returnlu olani yapmaya calisiyoruz .
		System.out.println(total);
	}

public static void sum(int a,int b) {
	System.out.println("sum is "+(a+b));}


public static void sum(double a,double b) {
	System.out.println("double sum is "+(a+b));}

public static void sum(int a,int b,int c) {
	System.out.println("three numbers sum is "+(a+b+c));}

public static void sum(double a,long b,boolean c) {
	System.out.println("you have entered "+a+" "+b+" "+c);}

public static int sum(int a,double b,byte c) {/// burada void degilde int dedik, return type int seklinde olmali
		int sum=a+(int)b+c;
		
	
	return sum;
}
}

