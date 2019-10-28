package day24_ArraysContinue;

public class ArraysClass {
public static void main(String[] args) {
	/*
	 Array declerations:
	 		Datatype[] variablename={1,2,3,4,5,6};
	 		
	 */
	int[] arr= {10,20,30};// bu alttaki ile ayni
	
	int arr2[]= {10,20,30};
	
	
	int[] arr3= {'A','B','C'};
	
	String []arr4= {"Ibrahima","Yattara"};
	
	String name=arr4[1];
	System.out.println(name);
	
	
	//ARRAYS SIZE
	//istersek deger veririz ==> int[]arr={1,2,3,55,79} bunun size belli
	// yada 					 int[] arr=new int[size number];  // burada sadece SIZE VAR.VALUE YOK
	
	
	int[] mynum=new int[5];
	for(int i=0;i<mynum.length;i++) {
		System.out.print(" "+mynum[i]);// burada default olarak 0 geliyor. EGERKI double veya float olursa 0.0
	}
	
	/*
	 Default values:
	 int,byte,short,long==0
	 double,float==0.0
	 boolean==false
	 char==empty
	 
	 String==null
	 */
	System.out.println();
	int ch[]=new int[3];
	ch[0]=10;
	ch[1]=20;
	ch[2]=30;
	
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	
	
	ch=new int[4];//BURADA ARRAY SIZENI YENIDEN Initialaze ettik.yani 4 tane kabul edcek. GECMISTEKILERI lost ediyor
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	
	System.out.println();
	
	int[] array1= {1,2,3};
	int[] array2= {4,5,6,7};
	
	int[] array3=new int[array1.length+array2.length];// sadece size verdik
    	
	//Bu alttakini koyarak 1-2-3 u yaptik
	
	for(int i=0;i<array1.length;i++) {
		array3[i]=array1[i];
	System.out.print(array3[i]);}
	
	System.out.println();
	
	for(int i=0;i<array2.length;i++) {
		array3[i+array1.length]=array2[i];
	System.out.print(array3[i]);}
	
	 
	 System.out.println();
	for(int i=0;i<array3.length;i++) {
		System.out.print(array3[i]+" "); 
	}
	

}
}
