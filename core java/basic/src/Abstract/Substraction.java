package Abstract;

public class Substraction  extends Addition {
	private int a;
	private int b;
	
	 public Substraction(int a,int b)
	 {
		 this.a=a;
		 this.b=b;
		 int c=a-b;
		 System.out.println(c);
	 }
	 public int getA()
	 {
		 return a;
	 }
	 public int getB()
	 {
		 return b;
	 }
	
	
	
	
	@Override
	public void sum() {
		int c=a+b;
		System.out.println(c);
		
		
		// TODO Auto-generated method stub
		
	}
	
	

}
