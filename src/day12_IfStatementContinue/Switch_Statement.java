package day12_IfStatementContinue;

public class Switch_Statement {
	
	/*
	 Switch(Expression){
	 	case CaseVale:
	 		statement1
	 		statement2
	 		break; // purpose of break is exitinf the switch statement. break = {} demek yani runlari ayirmaya yariyor
	 		
	 	default:
	 		statement;
	 */
	public static void main(String[] args) {
		
	
	int score=1;
	if(score==1) {System.out.println("1");}
	else if (score==2){
		System.out.println("2");}
	
	
	switch(score) { // must give an expression:data
	case 1: System.out.println("1");
			break;
	case 2:
		System.out.println("2");
		break;
	default:
			System.out.println("invalid");
			break;
	}
	
	String str="JAva";
	switch(str) {
		default:System.out.println("invalid"); // burada defaultu basa koydum. okumaya basliyor ama arada{} veya break olmadigi icin 
		case "C#": //okumaya devam ediyor. eger ki defaultu en sona koysaydik, sadece invalid gelirdi ama en basta oldugu icin hepsini
		System.out.println("C# programming");// okuyor
		case "python":
			System.out.println("Python programming");
		}
	
	String str1="Java";
	switch (str1) {
		case "C#":
		System.out.println("C# programming");
		case "python":
			System.out.println("Python programming"); 
		default:System.out.println("invalid");}// burada ilk 2 case okuyamiyor sonra defaulta geliyor sadece onu okuyabiliyor
	}
	
}
