package day30_Wrapper;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
	
public static void main(String[] args) {
	ArrayList<String>namelist=new ArrayList<>();
	namelist.add("Oguz");
	System.out.println(namelist);
	
	Scanner scan=new Scanner(System.in);
	
	ArrayList<String>studentNames=new ArrayList<>();
	

	
	while(true) {
		System.out.println("Enter a name");
		String str1=scan.nextLine();
		
		studentNames.add(str1);
		
		System.out.println("Do you want to keep entering?");
		
		String answer=scan.nextLine();
		if(answer.contentEquals("no")) {
			break;
		}
	}
	System.out.println(studentNames);
}
}
