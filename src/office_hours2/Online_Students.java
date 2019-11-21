package office_hours2;

public class Online_Students extends Cybertek_School {

	int zoomID;
	
	public void answer() {
		System.out.println("Online students are always answering question");
	}
@Override
public void tution() {
	System.out.println("tution for online students");
}
@Override
public void paytution() {
	System.out.println("online pays 1k a month");
}
}
