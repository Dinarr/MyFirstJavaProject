package Overriding;

public class SavingsAccount extends BankAccount {

	double interestIncome;

	@Override
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount/20; //amount * 0.2;
		balance -= fee;
		System.out.println(amount + " is transferred successfully with fee: " + fee);
		
	}

	@Override
	public void info() {
		System.out.println("Bank account information\n");
		System.out.println("Interest Income: " + this.interestIncome);
		System.out.println("Balance: " + this.balance);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Name: " + this.name);
	}
}
