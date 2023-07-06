package rays.PracticeExercise;

public class ClonlingAccount implements Cloneable {
    private int balance=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
    
}
