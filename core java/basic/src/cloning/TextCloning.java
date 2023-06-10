package cloning;

public class TextCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Account a1= new Account(100);
	     Account   a2= (Account)a1.clone();
	       a2.setBalance(20);
	     
	     System.out.println(a1.getBalance());
	     System.out.println(a2.getBalance());
		
          
	}

}
