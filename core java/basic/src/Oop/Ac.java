package Oop;

public class Ac {
	private String number = null;
	private String accountType = null;
	private double Balance = 0;

	public void setNumber(String number) {
		this.number = number;

	}

	public String getNumber() {
		return number;

	}

	public void setAccoutType(String accounttype) {
		this.accountType = accounttype;
	}

	public String getAccoutType() {
		return accountType;

	}

	public void setBalance(double balance) {
		this.Balance = balance;
	}

	public double getBalance() {
		return Balance;
	}

	public void Deposit(double ammount)
    {
       double   	total=getBalance() + ammount;
       
       if(total<1000) 
       {
    	   System.err.println("insuffient Balance");
    	   
       }
       else
   
      System.out.println("Balance is"+total);
		
		
	}
	public void Withdrwal(double ammount)
	{
		double total=getBalance()-ammount;
		System.out.println("Balance is"+total);
	}

	
}