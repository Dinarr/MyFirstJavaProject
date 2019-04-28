package objectcreation;

public class BankAccount {

	String type;
	int accountNumber;
	long balance;
	String holderName;
	
	public void deposit(double amount) {
		System.out.println(amount + " is deposited to your account!");
		amount += balance;
	}
	public void transfer(double amount) {
		System.out.println(amount + " is transferred from your account!");
		balance -= amount;
	}
	public void info() {
		System.out.println("\nYour Bank information");
		System.out.println("Name: " + holderName);
		System.out.println("Balance: " + balance);
		System.out.println("Type: " + type);
		System.out.println("Account number: " + accountNumber);
	}
	
	
}
