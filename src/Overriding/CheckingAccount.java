package Overriding;

public class CheckingAccount extends BankAccount {

	@Override
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount * 0.05;
		balance -= fee;
		System.out.println(amount + " is transferred successfully with fee: " + fee);
	}
}
