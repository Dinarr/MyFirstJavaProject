package Overriding;

public class Banking {
	
	public static void main(String[] args) {
		SavingsAccount sv = new SavingsAccount();
		sv.name = "Dina";
		sv.accountNumber = "AF57363";
		sv.balance = 30000000;
		sv.interestIncome = 30;
		sv.transfer(2000);
		sv.info();
//		BankAccount ba = new BankAccount();
//		ba.accountNumber = "A23456";
//		ba.balance = 3000;
//		ba.name = "Dinara";
//		ba.transfer(1000);
//		ba.info();
	}

}
