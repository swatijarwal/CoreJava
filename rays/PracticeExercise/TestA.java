package rays.PracticeExercise;

public class TestA {
	public static void main(String[] args) throws CloneNotSupportedException {
		 A a= new A();
		 a.setBalance(100);
		 A a1= (A) a.clone();
         a1.setBalance(200);
         System.out.println(a.getBalance());
         System.out.println(a1.getBalance());
	}

}
