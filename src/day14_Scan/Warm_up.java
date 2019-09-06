package day14_Scan;

public class Warm_up {
public static void main(String[] args) {
	String str="wednesday";
	if(str=="monday" || str=="tuesday") {System.out.println("JAVA");}
	else if(str=="thursday" || str=="friday") { System.out.println("Selenium");}
	else if (str=="wednesday" || str=="saturday") {System.out.println("SQL");	}
	else {System.out.println("DAY OFF");}
	

		
	
	
	String strr="tu";
	switch(strr) {
	case "monday":	
	case "tuesday":// burada monday veya tuesday yazdigimizda java cevabi geliyor. fazladan satir yazmadik
		System.out.println("Java");
		break;
	case "wed":	
	case "sat":
		System.out.println("sql");
		break;
	case "thurs":	
	case "friday":
		System.out.println("sel");
		break;
		default:System.out.println("DayOFf");
		break;
	}}}
