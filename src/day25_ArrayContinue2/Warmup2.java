package day25_ArrayContinue2;

public class Warmup2 {
public static void main(String[] args) {
	//String arraylerde uniq bulmak
	String [] arr= {"ali","veli","celo","ali","veli"};
	
	
	for(int j=0;j<arr.length;j++) {
		
	int count=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==arr[j]) {
			count++;}
		
		}if(count==1) {System.out.println(arr[j]);}
	}
	
	
	
}
}
