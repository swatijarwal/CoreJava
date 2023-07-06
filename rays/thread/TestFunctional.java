package rays.thread;

public class TestFunctional {

	public static void main(String[] args) {
	   TestHello h= new TestHello() {
		
		@Override
		public void show() {
			System.out.println("Functional Interface");
			
		}
	};
	   h.show();
	   h.DefaultMethod();
	   TestHello.StaticMethod();

	}

}
