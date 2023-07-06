package rays.Cloning;

public class A  implements Cloneable{
	private int balance=0;
	public A(int balance)
	{
		this.balance= balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
