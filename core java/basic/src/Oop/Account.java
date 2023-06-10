package Oop;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 0;
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}

	public void setAccountType(String accountType)
	{
		this.accountType= accountType;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		double total = getBalance() + amount;
		
		if(total<2000)
		{
		System.err.println("Insuffient Balance");
	    }
		else
			System.out.println("Balance is = "+ total);
        }
	
	public void withdrwal(double amount)
	{
		double total = getBalance() - amount;
		System.out.println("Balance is = "+ total);
	}
}