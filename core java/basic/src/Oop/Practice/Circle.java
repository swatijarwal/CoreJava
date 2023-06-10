package Oop.Practice;

public class Circle {
	private int radius;
	
	public void setRadius(int radius)
	{
		this.radius=radius;
	}
   public int getRadius()
   {
	   return radius;
   }
   public double getArea()
   {
	   return Math.PI*radius*radius;
   }
   public double getCircumference()
   {
	   return Math.PI*radius;
   }
}
