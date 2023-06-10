package Polymorphism;

public class Rectangle extends Shape {
	private double length;
	private double width;


	public void setLength(double length)
	{
		this.length=length;
	}
    public double getLength()
    {
    	return  length;
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
