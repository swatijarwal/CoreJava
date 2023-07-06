package rays.Cloning;

public class TestPerson {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 Person p1=new Person("swati");
		 Person p2=(Person) p1.clone();
		 p2.setName("archna");
		 p2.account.setBalance(20);
		 p1.account.getBalance();
		 System.out.println(p1.getName());
		 System.out.println(p1.account.getBalance());
		 System.out.println(p2.getName());
		 System.out.println(p2.account.getBalance());
		 
		 
		 

	}

}
