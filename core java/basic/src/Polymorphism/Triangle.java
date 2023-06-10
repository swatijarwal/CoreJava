package Polymorphism;

public class Triangle extends Shape {
 private double base;
 private double height;
 
 public void setBase(double base)
 {
	 this.base=base;
 }
 public double getBase()
 {
	 return base;
 }
 public void setHeight(double height)
 {
	 this.height=height;
 }
 public double getHeight()
 {
	 return height;
 }
  public double area ()
  {
	  double Tarea=base*height/2;
	  System.out.println( "Area of triangle" + Tarea);
	return Tarea;
	  		
	  
  }
}
