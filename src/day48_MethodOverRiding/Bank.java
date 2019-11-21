package day48_MethodOverRiding;


public class Bank {
	
public void InterestRate() {
	
	System.out.println("9 percent");
}
public static void main(String[] args) {
	BankofAmerica bank1=new BankofAmerica();
	bank1.InterestRate();//9
	
	Chase bank2=new Chase();
	bank2.InterestRate();//0
	
	PNC bank3=new PNC();
	bank3.InterestRate();//9
}
}

class BankofAmerica extends Bank{
	@Override// bunu koyduk, boylece overrided oldugunu anladik. eger ki override olmasaydi, hata verirdi
	public void InterestRate() {
		System.out.println("5 percent"); // subclassta overriding ettik
	}
}

class Chase extends Bank{
	public void InterestRate() {
		System.out.println("7 percent");
	}
}
class PNC extends Bank{
	public void InterestRate() {
		System.out.println("3 percent");
	}
}