package rays.exception;

public class AccountEx extends Exception {

	private int balance = 0;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int ammount) {
		int total = getBalance() + ammount;
		setBalance(total);
		System.out.println("Balance after deposite = " + total);

	}

	public void withdrawl(int amt) throws InsufficientFund {
		int total = getBalance() - amt;

		if (total < 2000) {

			throw new InsufficientFund();

		} else {

			System.out.println("Balance after withdrawl = " + total);
			setBalance(total);
		}
	}

}
