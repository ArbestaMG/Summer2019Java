package optional_Practices;

public class Custom1_Bank_Practice {
public static void main(String[] args) {
	Custom1_Bank obj=new Custom1_Bank();
	
	obj.accBalance(150000);
	obj.accHolder("Oguz MAGDEN");
	obj.accNumber(999999999);
	obj.accPin(12345);
	
	//obj.deposit(20000);
	obj.withdraw(10000);
}
}
