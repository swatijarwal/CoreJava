package CnstructorOFPOly;

public class Rectangle  extends Shape{
	private double length;
	private double width;
	
Rectangle(double l,double w)
{
	length=l;
	width=w;
	System.out.println(length);
	System.out.println(width);
}
  public void setRectangle(double length)
  {
	  this.length=length;
  }
  public double getRectangle()
  {
	  return length;
  
  }
  public void setWiegth(double wieght)
  {
  	this.width=width;
  }
  public double getWiegth()
  {
  	return width;
  }    
   public double area()
   {
  	double Rarea=length*width; 
  	System.out.println("Area of Rectangle"+ Rarea);
		return Rarea;
		
   }
 
	

}
