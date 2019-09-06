package day08_ShortHandOperators;

public class warmup {

	public static void main(String[] args) {
		// task1:wrote a java program that convers gallons to liters. 1 galoon=3.785 L
		
		double gallon= 100;
		double liter= gallon*3.785;
		String result1= gallon+" gallons equal to " + liter + " liters";
		System.out.println(result1);
		System.out.println(gallon+" gallons equal to "+liter+" liters");
		
		
		// task2:
		int x=2;
		int y=x++;
		System.out.println(y);	//2
		
		int x2=2;
		System.out.println(x2++);	//2
		System.out.println(x2);		//3
		
		int x3=2;
		System.out.println(--x3); //1
		
		int x4=8;
		int y4=x4--;
		System.out.println(y4); 	//8
		System.out.println(x4); 	//7
		
		double P= 10, K=11, L=13;
		
		System.out.println(L);
	
		
	}
}
