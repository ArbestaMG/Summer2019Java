package day13_IfStatement_SwithcStatement;

public class Quiz_Review {
public static void main(String[] args) {
	int n='B';
	
	System.out.println(n);    // burada direk n oldugu icin degeri 66
	System.out.println('n');  //  burada '' icine alinca degeri n 
	
	// Kahoot
    //  Q1:
            if( !true != !false) {
            //  false != true ==> true
                System.out.println("Cybertek");
            }
    
    // Q2:
            boolean resultA = 9 >=9 || 10 <= 10 ,
                    resultB = 'A' >= 128 && 'B' < 128;
            //  resultA = true || true => true
                    // resultB = false && true => false
                    
            if( !resultA ) {
                // true
                    if( resultB ) {
                        // false
                        System.out.println(resultA);
                    }else {
                        System.out.println(resultB);
                    }
            }
                    
                    
            // Q3:
            if(true) {
        
            }else if(false) {
                
            }  
            // else block is not mandatory
            
            
        // Q4:
            int num = 9;
            if(++num < 10) {
            //  10 < 10 ==> false
                System.out.println(num+"Hello Wolrd");
            } else {
                System.out.println(num +"Hello Universe");
                //                  10
            }
            
            System.out.println(++num); //11
            
            int num2 =9;
            if( num2++ < 10) {
            //  9 < 10 ==> true
                    System.out.println(num+"Hello Wolrd");
                    //                  10
                } else {
                    System.out.println(num +"Hello Universe");
                }
    
            System.out.println( num2++ ); // 10
            System.out.println( num2 ); // 11
            
            
        // Q5:
            int x = 1, y=0;
            
            if(x++ > ++y) {  // x=2, y =1
    //          1  >  1  ==> false        
                System.out.print("Hello");
            } else {
                System.out.print("Welcome");
            }
            
            System.out.println(" Log "+x+":"+y);
            //                          2    1
            
            
            
            float A = 5.0F;
            
            
            // Q7:
            if(true) {
                System.out.println("one");
            }
            if(true) {
                System.out.println("two");
            }
            if(true) {
                System.out.println("true");
            }
            
            
            
            if(true) {
                System.out.println("1");
            }
            else if(true) {
                System.out.println("2");
            }
            else if(true) {
                System.out.println("3");
            }
        
        boolean Result = true;
        int N =100;
        if( Result ) {
         // true
            N /= 10;    //  N = 10
            Result = !Result;  // Result = false
        }
        if( Result ) {
        //  false
            N *= 2;   // N = 10
        }
        else {
            N -= 5;  // N = 10 -5 = 5;
        }
        
        
        // Q8:
            boolean X = true;
            
            if( X == false) {
            // true == false  ==> false
                System.out.println("One");
            }
            else if( X == false != true) {
            //       true ==  false !=true  
            //       true == true  ==> true  
                System.out.println("Two");
            }
            else  if(X == true) {
                //  true
                System.out.println("Three");

            }
            else if(X != false) {
                // true
                System.out.println("Four");
            }
            
                
        /*
          = : assignment
          == : equal
          
         */
            
    
            
    // Q10:
        
            int n1 = 'B'; // corresponding number of the character will be assigned
            // n = 66;
            System.out.println(n1);
            System.out.println( 'B' ); // char printed as it is
            
            if(n1 > 128 || n1 <= 129) {
            //  false  ||  true   ==> true
                System.out.println('B');    
            }
            else {
                System.out.println('A');
            }
            
            
            //EXAMPLE
            /*
             age 18= can vote
             age=70 can vote three times
             age=70-50 can vote double times
             age=50-18 can vote one time
             
             */
            
            int age=90;
            if(age>0) {
            if (age>18) { 
            	if(age>=70){System.out.println("can vote three times");}
            	else if(age>=50) {System.out.println("can vote two times");}
            	else{System.out.println("can vote one time");}}
            else {System.out.println("go home you r baby");}}
            
            else {System.out.println("not eligible");}
            
            
       
                // Q1:
                
                int num1 = 9;
                if(num1++ == 10) { // line 1   num = 10
                //  9  == 10 ==>  false  
                    System.out.println("Hello World "+num1);    // line 2
                }
                else {
                    System.out.println("Hello Universe "+num1);  // line 3
                    //                                   10
                }
                
                
            // Q2:  
                
                int score=0;
           if(true) {
                if(score == 0) {
                    // 0 ==0 => true
                        score += 50; //  score =50;
                }
                 if(score !=0 ) {
                //  50 != 0 ==> true
                    score +=50;  // 50 += 50 ==> 100;
                }
           }
                System.out.println(score);
                
                
                // Q3:
                char grade ='A';
                boolean Passed = grade == 'A' || grade =='B';
                //                  'A'=='A'  ||  'A' == 'B'
                //                    true    ||   false  ==> true
                
                boolean Passed2 = grade == 'C' || grade =='D'; 
                //                 'A' == 'C'  ||  'A' == 'D';
                //                  false      ||    false  ==> false    
                if( Passed || Passed2) {
                //   true  || false  ==>  true   
                    System.out.println("You've passed the exam");
                }
                else {
                    System.out.println("You failed");
                }
                
                
                // Q4:
                
                boolean Aa = true, B =  !false;
                //                B = true
                    if( B ) {
                        // true
                        System.out.println("B");
                    }
                    else if(  Aa ) {
                        // true
                        System.out.println("A");
                    }
                     else {
                        System.out.println("C");
                    }
                // Q5:
                    boolean result = true;
                    
                    if(result) {
                        System.out.println("it's true");
                    }
                    else {
                        System.out.println("it's false");
                    }
                    /*
                    else if(result) {
                        System.out.println("None of the above");
                    }
                    multi-branch if statement starts with if and ends wit else statement,
                     cannot end with else-if statement
                     
                     undo : command +z
                    */
                    
                // Q08:
                    
                    boolean A1 = true, B1 = !A1;
                    //                   B1=false
                    if(A1) {
                    // true
                        if(B1) {
                    //      false
                            System.out.println("Monday");
                        }else {
                            System.out.println("Tuesday");
                        }
                    }
                    else {
                        if(A1) {    
                            System.out.println("Thursday");
                        }else {
                            System.out.println("Friday");
                        }
                    }
                    
                // Q09:
                    int number =10;
                    if(--number > 10) {
                    //   9 > 10 ==> false
                        System.out.println("Hello Cybertek "+number);
                    }else if(number ==9) {
                        System.out.println("Hello World "+number);
                        //                                  9
                    }
                    
            // Q10:
                    boolean Xx = true;
                    boolean Y = !Xx==false;   // Y = true
                    //          false == false  ==> true
                    
                    boolean Z = Y;   // Z = true
                    
                    if( Xx ) {
                        System.out.println("Hello Everyone");
                    } 
                    if( Y ) {
                        System.out.println("Today is great day");
                    } 
                    if( Z ) {
                        System.out.println("We have picnic on Saturday");
                    }
                    
                    
                    
            System.out.println("====================");
                    
                if( X ) {
                    System.out.println("Hello Everyone");
                } 
                else if( Y ) {
                    System.out.println("Today is great day");
                } 
                else if( Z ) {
                    System.out.println("We have picnic on Saturday");
                }
                
                
            //  nested if : precondition. 
            //              if a condition can be evaluate to multiple scenarios
                
                
            /*
             vote age:
                age >= 18  ==> eligible to vote
                
                age >= 70  ==> can vote three times
                70 > age >=50 ==> can vote twice
                50 > age >=18 ==> can vote one time
                
             */
         
                
                
            
}
}
