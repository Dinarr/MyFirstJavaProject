package Overriding;

public class BankAccount {

	public double balance;
	public String accountNumber;
	public String name;
	
	public void info() {
		System.out.println("Bank account information\n");
		System.out.println("Balance: " + this.balance);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Name: " + this.name);
	}
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount/10; //amount * 0.1;
		balance -= fee;
		System.out.println(amount + " is transferred successfully with fee: " + fee);
	}
	public void deposit(double deposit) {
		System.out.println(deposit + " is deposited to account number: " + this.accountNumber);
				balance += deposit;
	}
}
