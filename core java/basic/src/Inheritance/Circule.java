package Inheritance;

public class Circule extends Shape {
   private double radius;
   public static final double PI=3.14;
    Circule(double r)
    {
    	radius=r;
    	System.out.println(radius);
    }
   
   
    public void setCircule(double radius )
    	{
    	  this.radius=radius;	
    	}
    public double getCircule()
    {
    	return radius;
    }
   
}
