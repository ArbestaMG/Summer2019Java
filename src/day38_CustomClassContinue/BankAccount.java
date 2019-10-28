package day38_CustomClassContinue;

public class BankAccount {
    
    /*
     WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: showBalance, deposit, withdraw
        requiremnts: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                    2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
     */
    
        String AccountHolder;// instance variable
        long AccountNumber;
        double balance;
        String username,password;
        public BankAccount(String username,String password) {
        	this.username=username;
        	this.password=password;
        }
        public BankAccount() {
        	
        }
        							// local variable
        public BankAccount(String AccountHolder,long AccountNumber) {
        	this.AccountHolder=AccountHolder;// this is used for calling instance variables in an object instance
        	this.AccountNumber=AccountNumber;// this is used when local and instance variables has same names
        }
        
        public void ShowBalance() {
            System.out.println("----------------------------------------");
            String acct = ""+AccountNumber;
            String AccountNumber = "************"+acct.substring(12);
            System.out.println("Account Holder: " + AccountHolder);
            System.out.println("Account Number: " + AccountNumber);
            System.out.println("Available Balance: $" + balance);
            System.out.println("----------------------------------------");
        }
        
        public void Deposit(double amount) {
            System.out.println("----------------------------------------");
           String acct = ""+AccountNumber;
            String AccountNumber = "************"+acct.substring(12);
            System.out.println("Depositing $"+amount +" to the account "+AccountNumber);
            balance += amount; 
            System.out.println("New Balance: $" + balance);
            System.out.println("----------------------------------------");
        }
        public void WithDraw(double amount) {
            System.out.println("----------------------------------------");
            
            if(balance<= 0) {
                System.out.println("there is no available balance");
                return;  // exists the method withdraw()
            }
            
            String acct = ""+AccountNumber;
            String AccountNumber = "************"+acct.substring(12);
            System.out.println("Withdrawing $"+amount +" from the account "+AccountNumber);
            balance -= amount; 
            
            if(balance < 0) {
                balance -= 35;
            }
            System.out.println("New Balance: $" + balance);
            
            System.out.println("----------------------------------------");
            
        }
        
        public void accountSetup(String name,long acctNum) {
        	AccountHolder=name;
        	AccountNumber=acctNum;
        }

}
