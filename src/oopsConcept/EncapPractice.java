package oopsConcept;

class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int a) {
		this.balance = a;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("withdrawn");
		} else {
			System.out.println("insufficient");
		}
	}
}

public class EncapPractice {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.setBalance(60);
		acc.deposit(100);
		acc.withdraw(200);
		System.out.println("Remaining balance: " + acc.getBalance());
	}
}
