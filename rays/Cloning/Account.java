package rays.Cloning;

public class Account  implements Cloneable {
	
      private int balance=0;
      
   public Account   (int balance)
   {
	   this.balance=balance;
   }
   public  void setBalance(int balance)
   {
	   this.balance=balance;
   }
   public int getBalance()
   {
	   return balance;
   }
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
}
  