package day13_IfStatement_SwithcStatement;

public class Switch {
public static void main(String[] args) {
	

	/*
	 case CaseValue:
	 statement1;
	 statement2;
	 break;
	 
	 default: // bu else statement gibi.eger ki hic birsey run olmazsa bu olur.her yere koyabilirsin.hic birsey mandatory degil
	 statement1;
	 statement2;
	 break;
	 
	 We can use as many cases as we want
	 casevalue must match with the switch expression data type
	 break statement: used for exiting the switch statement.
	 
	 Switchi kod yazarken kullaniyoruz. sadece bir deger digerine esitken kullaniyoruz
	 
	 */
	
	int num=5;
	switch(num) {
	case 7: 
		System.out.println("Sunday");
		break;// breakten sonra tekrardan ama defaulten once syste.out.println yaparsak hata verir.
		default:
			System.out.println("invalid default");
			break;
		case 10-5:System.out.println("friyay");
		break;}
		
		String days= "Tuesday";
		switch(days) {
		case "Monday": // burada string oldugu icin baska data type (int , rakam vs) kullanamayiz.
			System.out.println("Mon");
			break;
		case"Tuesday":
			System.out.println("Tudu");
			break; //burada breaki silersem, sonuc Tudu ve Wedo olur.
		case"Wednesday":
			System.out.println("Wedo");
			break;
			default :
			System.out.println("NONONONON");
			break;
			}
		/*
		 switch yaparken, 4 data type kullanilamaz. ya karakter olacak, ya digits,yada text
		 double a= 10l,10d.10D
		 float a=10f,10F
		 long a=10,10l,10L
		 boolean a=true,false,10>9
		 */
		byte n1=10;
		switch (n1){}
		// OR Logic:
		char grade='B';
		
		if(grade=='A'|| grade=='B') {
			System.out.println("passed the exam");}
		else {System.out.println("Failed");}
			
	
		switch (grade) {
		case 'A': // burada A or B gibi oluyor.	
		case 'B':
		System.out.println("passed the 2.exam");
		break;
		default:System.out.println("failed the exam");	}
		
		String US="USA";
		if(US=="USA" || US=="America" || US=="US") {
			System.out.println("American");}
		else {System.out.println("Not American");}
		
		switch("oli") {
		case "US":
		case "USA":
		case "American":
			System.out.println("2. American");
			break;
			default: System.out.println("2.Not American");
			break;
		}
		
		
		
		}


}
