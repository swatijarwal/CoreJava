package rays.Cloning;

public class TestA {

	public static void main(String[] args) throws CloneNotSupportedException {
	   A b1= new A(100);
      A b2=(A) b1 .clone();
      b2.setBalance(200);
      System.out.println(b1.getBalance());
      System.out.println(b2.getBalance());
	}

}
