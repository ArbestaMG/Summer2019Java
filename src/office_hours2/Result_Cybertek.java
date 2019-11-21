package office_hours2;

public class Result_Cybertek {
public static void main(String[] args) {
	
	
//	Cybertek_School obj=new Cybertek_School(); can not create obj from this class because we made it abstract
	
	Local_Students s1=new Local_Students();
	s1.tution();
	s1.party();
	
	s1.name="Ali local";
	s1.batch="B12 local";
	
	s1.offer(5);
	s1.offer();
	
	s1.badgeID=123;
	s1.paytution();

	System.out.println("======");
	
	Online_Students s2=new Online_Students();
	
	s2.name="Celi online";
	s2.offer(10);
	
	s2.tution();
	s2.answer();
	s2.paytution();
}
}
