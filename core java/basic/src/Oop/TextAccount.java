package Oop;

public class TextAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setNumber("PNB12975");
		System.out.println(a.getNumber());
		
		a.setAccountType("Savings");
		System.out.println(a.getAccountType());
		
		
		//a.deposit(3299);
		a.setBalance(4000);
		System.out.println(a.getBalance());
		a.deposit(100);
		a.withdrwal(1000);
		a.deposit(1000);
	
		
       
}
}