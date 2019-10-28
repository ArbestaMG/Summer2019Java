package day23_Arrays;

public class ArraysClass {
/*
 Arrays are variable that we can store multiple values
 
 
 regular variable:
 int a=10; we can have only one value
 
 array:
 int[] arr= {10,20,30,40}; we can have multiple values
 	dataType   variableName
 
 	each values(Elements) in an array have their own index numbers
 	in[] VariableName={10, 20, 30, 40, 50}
 		//index num:   0	1	2	3	4
 		 
 		 
 	to retrieve the data of the array:
 	VariableName[indexNumber of data]:
 		
 			VariableName[3]==>40
 			VariableName[0]==>10
 */
	public static void main(String[] args) {
		
	
	
	int[] arr= {1,2};
	
	String[] names= {"Nigar","Sumeyya","Madina","Juline"};
	//					0		1		2			3
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	
	String str1=names[2];
	String str2=names[3];
	
	System.out.println(str1);
	System.out.println(str2);
	
	// System.out.println(names[4]); bu calismaz cunku bunun icin indeximiz yok
	
	double[] mynum= {1,2,3,4,5,8,0,2};
	// index:        0 1 2 3 4 5 6 7
	
	for(int i=0; i<8;i++) {
		System.out.println(mynum[i]);
	}
	
	System.out.println();
	String str="ABC";
	int A=str.length();
	System.out.println(A);// 3
	
	int [] num= {12,24,44,55,2,1,4,5,7,3,2,1,13,5};
		int B=num.length;
		int highindexnum=num.length-1;
		System.out.println(highindexnum); //13
		
		for(int i=0; i<num.length;i++) {
			int s1=num[i];
			System.out.print(num[i]+" ");//14
		}
		System.out.println();
		
		char[] mychar= {'A','B','C','D'};
		int highindexnum2=mychar.length;
		System.out.println(highindexnum2); //4
	
}
}