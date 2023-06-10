package CnstructorOFPOly;

public class Circle extends Shape {
	private double radius;
	 public static final double PI=3.14;
	  Circle(double r)
	  {
		  radius=r;
		  System.out.println(radius);
	  }
	 
	  public void setRadius(double radius)
	  {
		  this.radius=radius;
	  }
	  public double getRadius()
	  {
		  return radius;
	  }
	  public double area()
	  {
		  double Carea=PI*radius*radius;
		  System.out.println("Area of circle"+ Carea);
		return Carea;
	  }
}
