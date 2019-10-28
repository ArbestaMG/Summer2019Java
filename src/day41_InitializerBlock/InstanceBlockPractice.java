package day41_InitializerBlock;

public class InstanceBlockPractice {
	

    public String name ="Shirin";  //"Mihray" , "Dinara
    
    
    public InstanceBlockPractice(){
        this(10);  // name = "Muhtar";
        name = "Dinara";
    //  this(10);  // constructor call has to be the first step
    }
    
    {
        name ="Mihray";
    }
    
    {
        name = "Hatice";
    }
    
    public InstanceBlockPractice(int a) {
            name = "Muhtar";
    }
    
    public static void main(String[] args) {
        
        InstanceBlockPractice obj = new InstanceBlockPractice();
            obj.name = "Aijamal";
        System.out.println( obj.name );  //Shirin
        
        InstanceBlockPractice obj2 = new InstanceBlockPractice();
        System.out.println( obj2.name );  // Dinara
        
    
    }




}
