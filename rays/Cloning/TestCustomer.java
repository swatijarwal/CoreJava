package rays.Cloning;

public class TestCustomer {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 Customer c1= new Customer("swati" );
		 Customer c2=(Customer) c1.clone();
		  c2.setName("shivi"); 
		  c2.account.setBalance(200);
		   
		 
		 System.out.println(c1.getName());
		 System.out.println(c1.account.getBalance());
         System.out.println(c2.getName());
         System.out.println(c2.account.getBalance());
	}

}
