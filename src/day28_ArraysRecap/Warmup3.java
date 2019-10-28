package day28_ArraysRecap;

public class Warmup3 {
public static void main(String[] args) {
	calculategrade(20);
}

public static void calculategrade(int score) {
	char grade=(score>=90 && score<=100)?'A':
		(score>=80 && score<90)? 'B': 
			(score>=70 && score<80)?'C':
				(score>=60 && score<70)?'D':
					(score>=50 && score<60)?'F':
						'N';
	if(grade=='N') {
		System.out.println("invalid");
	}
	System.out.println(grade);
	
					
}
}
