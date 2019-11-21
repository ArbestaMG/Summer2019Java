package office_hours2;

public class Local_Students extends Cybertek_School {

	int badgeID;
	
	
	public Local_Students() {
		
	}
	
	public Local_Students(int badgeID) {
		
	}
	public void party() {
		System.out.println("students eating ice cream party");
	}
	
	//OverRide tution
	@Override
	public void tution() {
		System.out.println("this is a local student tuiton");
	}
	
	@Override
	public void paytution() {
		System.out.println("local pays 750 usd a month");
	}
}
