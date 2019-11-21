package optional_Practices;

import java.util.Arrays;

public class InterviewQ {
	
public static void main(String[] args) {
	divides(25,6);
	
	InterviewQ obj1=new InterviewQ();
	obj1.FINRA();
	
	System.out.println(Arrays.toString(Solution(1220)));
}
 public static void divides(int num1, int num2) {

	if(num2==0) {

		System.out.println("Invalid Number");

		return;}

	
		System.out.print(num1 +" devid by "+num2 +" is: ");

		int count =0;
                
			while(num1 >= num2) {

				num1 -= num2;

				count++;}

                  
				System.out.println(count+" and remainder is "+num1);

}

public static void FINRA() {

		String result = "";

		for(int i=1; i <= 30; i++) {

				if(i % 5==0 && i %3 ==0)
//					15,30				
					result += "FINRA ";

				else if(i%5 == 0)
//                    5-10-20-25-30
						result += "RA ";

				else if(i%3==0)
//                      3-6-9...					
						result+="FIN ";

				else
//                1,2,4,13,22	
						result += i+" ";

			}

			System.out.println(result);

}

public static int[] Solution(int N){

int[] result = new int[N];

int sum = 0;

for(int i=0; i < N-1; i++) {

result[i] =i;

sum += i;

}

result[N-1] = -sum;

return result;

    }
}
