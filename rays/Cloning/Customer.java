package rays.Cloning;

public class Customer implements Cloneable {
	private String name=null;
	public Account account = null;
	
	public Customer(String name)
	{
		this.name=name;
		this.account=new Account(100);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c1= (Customer) super.clone();
		c1.account=(Account) account.clone();
		return c1;
		
		
	}
	

}
