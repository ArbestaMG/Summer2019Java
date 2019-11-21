package office_hours2;

public abstract class Cybertek_School {
	
String name;
String batch;
String location;
private String SSN;


public void setSSN(String SSN) {
	this.SSN=SSN;
}
public String getSSN() {
	return SSN;
}
public void paytution() {
	System.out.println("studens are paying");
	
}

public void tution() {
	System.out.println("Your tution is based on the batch");
}
public void offer() {
	System.out.println("Congratz, yeyy!!!");
	}


//overload offer

public void offer(int number) {
	System.out.println("We have total "+number +" of offers");
	
}
public static void main(String[] args) {
	

Local_Students obj1=new Local_Students(); 
obj1.tution();
}

}