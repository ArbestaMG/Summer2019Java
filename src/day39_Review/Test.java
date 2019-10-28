package day39_Review;

public class Test {
//Quiz 10 review
 
	//q01
    // public Constructor() {  }
  
  //q02
    // public Test() { }
  
  // q03:
      /*
          public Test() {
          //  this();   // constructor can't call it self
          }
          
          public Test(int a) {
              this();
          }
      */
  
  //q4:
      /*
          public Test() {
              this(10);  // constrcutor can't contain itself.  no loops
              
          }
          
          public Test(int a) {
              this();  // constrcutor can't contain itself.  no loops
          }
      */
          /*
              public Test(int a){
                      this("Hello"); 
              }
              
              public Test(String str) {
                  this(10);
              }
          */
  
  
  // q05
      /*
          public Test() {
              int a=100;
          //  this(10);   // constructor call MUST be the first step
              System.out.println("Hello");
              
          }
          
          public Test(int a) {
              
              
          }
      */
  
  
  //q09:
  /*
      public Test() {
          // this(10);    
      }
      
      public Test(int a) {
          this();
      //  this("hello");  // one constructor can only call one constructor
      }
      
      public Test(String b) {
          this();
      //  this(10);  // one constructor can only call one constructor
      }
  */
  
  //q10:
      public Test() {
          // this(10);
          System.out.print("A ");
      }
      
      public Test(int a) { // A C B
          this(2.5);  // A C
          System.out.print("B "); //B
      }
      
      public Test(double b) { // A C
          this(); //A
          System.out.print("C "); //C
      }
  
  
  
  
  public static void main(String[] args) {
      //q1:
      //Test obj = new Test();
      
      //q2:
  //  Test obj2 = new Test(123);  // class objects MUST be created with existing constructor
      
      //q3:
  //  Test obj3 = new Test(200);
      
      
      // q10:
      Test obj4 = new Test(10);
      
      
  }
}