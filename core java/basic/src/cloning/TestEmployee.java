package cloning;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("abc");
		Employee e2=e1;
		e2.setName("def");
		System.out.println(e2);

	}

}
