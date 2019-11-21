package optional_Practices;

public class Overloading_Review {
/*-Overloading means , creating a new method with SAME NAME, DIFFERENT PARAMETERS
  - overload accepts ALL data types(primitives, Wrappers)
   -methods must have different PARAMETERS to overload
   -Everything CAN BE overloaded
   
   
    Overload method: improves the reusability
 				  felixible during runtime
*/
	public static void main(String[] args) {
		sum(10,30);
		sum(22.4,3413.4);
		sum(1,33,455);
		
		sum(3213,44,true);
		
		int total=sum(123,441.5,(byte)111);
		System.out.println(total);
		
		//Main Method overloaded
		int[]array3= {4,5,6};
		main(array3);
	}
	
	public static void sum(int a,int b) {
		System.out.println("sum is "+(a+b));}


	public static void sum(double a,double b) {
		System.out.println("double sum is "+(a+b));}

	public static void sum(int a,int b,int c) {
		System.out.println("three numbers sum is "+(a+b+c));}

	public static void sum(double a,long b,boolean c) {
		System.out.println("you have entered "+a+" "+b+" "+c);}

	public static int sum(int a,double b,byte c) {//THAT ONE IS NOT VOID
			int sum=a+(int)b+c;
			return sum;}

	public static void main(int[]a) {
		System.out.println("int array");}
			
}
