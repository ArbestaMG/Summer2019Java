package day44_AccessModifiers;


import java.util.ArrayList;
import java.util.Arrays;
public class CyberBank {
    
    public static void main(String[] args) {
        BankAccount Sarah = new BankAccount();
            Sarah.setAccountHolder("Sarah Abdujappar");
            Sarah.setAccountNumber(123456789654312L);
            
        System.out.println("Name: " + Sarah.getAccountHolder());
        System.out.println( "Account Number: "+Sarah.getAccountNumber() );
        System.out.println("Available Balance: "+Sarah.getAvailableBalance());
        
        Sarah.Deposit(2000);
        Sarah.ShowBalance(); // 2000
        
        Sarah.WithDraw(2500);  // 
        Sarah.ShowBalance();
        Sarah.Deposit(100000);
        Sarah.ShowBalance();
        
        
        BankAccount Serkan = new BankAccount();
            Serkan.setAccountHolder("Serkan");
            Serkan.setAccountNumber(9876543212321L);    
        
            Serkan.getAccountInfo();
            
            Serkan.Deposit(10000);
            Serkan.ShowBalance();  // 100000
            Serkan.WithDraw(3000);
            
            Serkan.getAccountInfo();
            
        
        BankAccount[] accounts = { Sarah, Serkan };
        
        ArrayList<BankAccount> Accounts = new ArrayList<>();
            //Accounts.add(Sarah);
            //Accounts.add(Serkan);
        Accounts.addAll(Arrays.asList(Sarah, Serkan));
        
        
    }
}