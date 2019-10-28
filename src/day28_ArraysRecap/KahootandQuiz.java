package day28_ArraysRecap;
import java.util.Arrays;
public class KahootandQuiz {


    public static void main(String[] args) {
        
        char[] ch = {'a','b','c'};
        int z = ch.length ; //3
        int count = 0; // 1+2 =2
        
        while( count < z - 1) {
            //  2 < 2
            
            count++;
        }
        System.out.println(count);
        
        String[] arr = {"Maral", "Nurullah"};
            arr[0] = arr[1];  // [ "Nurullah", "Nurullah"]
            arr[1] = arr[0];  // [ "Nurullah", "Nurullah"]
        System.out.println(Arrays.toString(arr));
        
        
        
        int nums[] = {5, 4, 3, 2, 1};
        
        for( int each : nums) {
            
            if(each == 3) {
                continue;
            }
            
            System.out.print(each+" "); //5 4 2 1
            break;   // 5
            
        }
        
        System.out.println();
        
        char[] characters = {'a', 'b', 'c'};
        for(char each: characters) {
            /*
             if(each == 'b')
                continue;  // a c
             */
            
            System.out.print(each+" ");
            
            if(each == 'b')
                continue;  // abc
            
        }
        System.out.println();
        
        long[] Arr = new long[2]; //[0, 0]
              Arr[0] = 5L;  // [5, 0]
              Arr[1] = 10L;  // [5, 10]
            
              Arr = new long[4];  // [0, 0, 0, 0]
              Arr[2] = 15L;   // [0, 0, 15, 0]
              Arr[3] = 20L;   //[0, 0, 15, 20]
            System.out.println(Arrays.toString(Arr)); 

            // quuestion4:
            String[] days = {"sun" , "mon", "wed", "sat"};
            int wd = 0; // 0-1 = -1;  -1+1+2 = 2,  2+2= 4,  4-1 =3
            
            for(int i=0; i < days.length; i++) { // i : 0 1 2 3
                
                switch( days[i] ) { //
                    case "sat": 
                    case "sun":
                            wd -= 1;
                            break;
                    case "mon":
                            wd++;
                    case "wed":
                            wd += 2;
                
                }
                
            }
            // when days[i] is sunday:  wd = 0-1 = -1
            // when days[i] is monday:  wd = -1+1+2 = 2
            // when days[i] is wednesday: wd = 2 + 2 = 4
            // when days[i] is saturday: wd = 4 - 1 = 3
            
            System.out.println(wd);
            
            
            // question05:
            int[] num1 = new int[3]; //[0, 0, 0]
            
            int[] num2 = {1, 2, 3, 4, 5};
            
                num1= num2;  
                // num1 = {1, 2, 3, 4, 5}  // num1' size has relinialized
            
                for( int each : num1 ) {
                    System.out.print(each+" ");
                }
            
                System.out.println();
            
            
                int numbers[];
            // numbers[0] = 1;  // size of the array havn't been initialized yet
              
                numbers =new int[2];
                numbers[0] = 10;
                numbers[1] =20;  // [10, 20]
                
                numbers = new int[4];   // [0, 0, 0, 0]
                numbers[2] =30;  // [0, 0, 30, 0]
                numbers[3] = 40; // [0, 0, 30, 40]
                
                System.out.println( Arrays.toString(numbers) );
                
        
                int[] intArr = {15, 30, 45, 60, 75};
                    intArr[2] = intArr[4];   // {15, 30, 75, 60, 75}
                    intArr[4] = 90;  // {15, 30, 75, 60, 90}
                    
                    System.out.println(Arrays.toString(intArr));
                
                
                int[] MyArr = {20, 40, 60, 80};
                int i=0; // 1 , 2 , 3
                
                do {
                    
                    System.out.println( MyArr[i]); // 20, 40, 60
                    i++; 
                    
                }while( i < MyArr.length-1 );
                //      3  < 3
                
                
                
              
              
    }
}
