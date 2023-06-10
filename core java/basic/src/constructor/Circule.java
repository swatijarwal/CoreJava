package constructor;

public class Circule  {
	private int radius;
	public static final double PI=3.14;
      Circule() {
		
	}
	 Circule(int r)
	 {
		 radius=r;
		 System.out.println(radius);
	 }
	
	public void setRadius(int redius)
	{
		this.radius=radius;
	}
	public int getRadius()
	{
		return radius;
	}
   
}
