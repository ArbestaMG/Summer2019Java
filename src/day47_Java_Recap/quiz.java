package day47_Java_Recap;


	class caller{
	    
	    private void methodA() {
	        
	    }
	    private void methodB() {
	        
	    }
	}
	public class quiz {//12
	    
	    // q1:
	    /*
	        int x, y;  // x = 9, y  25
	        
	    public quiz(int x, int y) {
	        initialize(x, y);
	    }
	    
	    public void initialize(int x, int y) {
	            this.x =    x*x ;
	            this.y  =   y*y;
	    }
	    
	    public static void main(String[] args) {
	            int x =3, y =5;
	            
	            quiz obj = new quiz(x, y);
	            System.out.println( obj.x +" "+obj.y);  // 9, 25
	            
	            System.out.println( x + " " + y);  // 3  5    
	        
	    }
	    */
	    
	    // q2
	    /*
	            public int amount;
	            // line 1
	            
	            {
	                 this.amount = 100;
	            }
	            
	            public quiz() {
	                this.amount =100;
	            }
	            
	        public static void main(String[] args) {
	            quiz obj = new quiz();
	            // line 2
	            
	            // this.amount;
	            //amount = 100;
	            obj.amount =100;
	            
	            System.out.println(obj.amount);
	        }
	    */
	    
	    //q3
	    /*
	    public static void main(String[] args) {
	        caller obj  = new caller();
	            obj.methodB();
	        
	    }
	    */
	    
	    /*
	    // Q4:
	        static int i;
	            int j;
	    
	    public static void main(String[] args) {
	        quiz obj1 = new quiz();
	        quiz obj2 = new quiz(); 
	        
	            obj1.i= 3;
	            obj1.j = 4;   //  obj2.i =3,    obj2.j =0; 
	        
	            
	            obj2.i= 5;    // obj1.i = 5;   obj1.j = 4;
	            obj2.j = 6;   // obj2.i = 5;   obj2.j =6;
	        
	        System.out.println(obj1.i +" " +obj1.j);   // 5  4
	        System.out.println(obj2.i +" " +obj2.j);   // 5 6
	        
	        
	    }
	    
	    */
	    
	    // q5
	    public static void main(String[] args) {
	        
	    }
	    
	    
	    
	}