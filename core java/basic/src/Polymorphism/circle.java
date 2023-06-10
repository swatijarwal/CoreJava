package Polymorphism;

public class circle extends Shape {
	private double radius;
 public static final double PI=3.14;
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
