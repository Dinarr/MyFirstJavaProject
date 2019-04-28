package objectcreation;

public class OpenAnaccount {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount();
		ac1.accountNumber = 23456789;
		ac1.balance = 30000000;
		ac1.type = "savings";
		ac1.holderName = "Dinara Otonova";
		ac1.info();
		ac1.deposit(2000000);
		ac1.info();
		ac1.transfer(100000);
		ac1.info();
	}
}
