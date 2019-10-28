package day38_CustomClassContinue;

public class BankAccountObjects {
    
    
    public static void main(String[] args) {
        
        BankAccount  account1 = new BankAccount();
            account1.AccountHolder = "Erhan Dolapci";
            account1.AccountNumber = 1234567891234567L;
            
            account1.ShowBalance();
            
            account1.Deposit(2000);
            account1.Deposit(4000);
            
            account1.WithDraw(3000);
            account1.WithDraw(3001);  // -36
            account1.WithDraw(2000);
            
            BankAccount account2=new BankAccount();
            	account2.accountSetup("Muazzes Gul", 1111222333444555l);
            	account2.ShowBalance();
            	account2.Deposit(100000);
            	account2.WithDraw(50000);
            
            BankAccount account3=new BankAccount("Gigi", 11112222111122221l);
            account3.ShowBalance();
            account3.Deposit(100);
            account3.WithDraw(120);
            account3.WithDraw(10);
        
        
    }
}