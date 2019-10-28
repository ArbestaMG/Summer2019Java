package optional_Practices;

import java.util.Scanner;

public class Custom1_Bank {
	
private String accHolder;
private long accNumber;
private double accBalance;
private long accPin;

//Getters

public String getaccHolder() {
	return accHolder;
}
public long getaccNumber() {
	return accNumber;
}
public double accBalance() {
	return accBalance;
}
public long accPin() {
	return accPin;
}

//Setters
public void accHolder(String name) {
	this.accHolder=name;
}
public void accNumber(long accNumber) {
	this.accNumber=accNumber;
}
public void accBalance(double accBalance) {
	this.accBalance=accBalance;
}
public void accPin(long accPin) {
	this.accPin=accPin;
}

public void deposit(double amount) {
	System.out.println("Your current acc balance is "+ accBalance);
	System.out.println();
	System.out.println("Your new balance is "+(amount+accBalance));
	System.out.println("Do you want to deposit more?");
	double newbalance= amount+accBalance;
	
	Scanner input = new Scanner(System.in);
	String answer=input.nextLine();
	
	while(answer.equalsIgnoreCase("yes")) {
		
		System.out.println("How much do you want to deposit?");
	double newmoney=input.nextDouble();
	
	System.out.println("Your newest balance is "+ (newmoney+newbalance));
	System.out.println("Do you want to anoter deposit");
	String realans=input.next();
	double realbalance=newmoney+newbalance;
	answer=realans;
	System.out.println("Your new account balance is "+realbalance);
	}
	}

	public void withdraw(double amount2) {
		System.out.println("your account balance is"+accBalance);
	
		if(accBalance>amount2) {
			System.out.println("Here is your money sir"+ amount2);
			System.out.println("Your remaning balance is "+(accBalance-amount2));
		}
		else if(accBalance==amount2) {
			System.out.println("You are taking all your money and your balance is now 0");
		}
		else {System.out.println("You dont have that amount of money");
		System.out.println("You can only withdraw "+ amount2);
		}
}
}
