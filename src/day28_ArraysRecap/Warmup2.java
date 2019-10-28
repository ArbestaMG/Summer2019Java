

package day28_ArraysRecap;

public class Warmup2 {
	/*
    4. write a method that accepts 3 parameters: 2 numbers and one operator, 
       and prints out the calculation 
       if operator is not between [-, +, *, /, %] output should be Invalid Operator
       Ex: calculate(10, 2, "*") ==> 20;
   5. write a method that can calculate grade
           if score is 100 ~ 90 ==> A
           if score is 89 ~ 80 ==> B
           if score is 79 ~ 70 ==> C
           if score is 69 ~ 60 ==> D
           if score is 0 ~ 59 ==> F
           otherwise ==> Invalid Score
    */
   
   public static void main(String[] args) {
       
       calculate(10, 5, "/");
       
   }
   
   
   
   public static void calculate(int a, int b, String Ope) {
       
       String result ="";
           if(Ope.equals("-")) {
               result += (a-b);
               
           } else if(Ope.equals("+")) {
               result += (a+b);
               
           } else if(Ope.equals("*")) {
               result += (a*b);
               
           } else if(Ope.equals("/")) {
               result += (a/b);
               
           }else if( Ope.equals("%")) {
               result += (a%b);
               
           } else {
               result = "Invalid Operator";
           }
           
           String Result2="";
            Result2 +=  (Ope.equals("-")) ? (a-b) :(Ope.equals("+")) ? (a+b)
                        :(Ope.equals("*"))? (a*b) : (Ope.equals("/"))? (a/b)
                         : ( Ope.equals("%"))? (a%b) : "Invalid Operator" ;
           
           System.out.println(Result2);
       
   }
   
   

}
