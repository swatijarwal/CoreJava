package Abstract;

public class Circle extends Shape {
	
	
	private double radius;
	 public static final double PI=3.14;
	 
     public void setCircle(int radius)
     {
    	 this.radius=radius;
     }
     public double getCircle()
     {
    	 return radius;
     }
	@Override
	public void area() {
		double Carea=radius*radius*PI;
		 System.out.println("Area of circle"+Carea);
		
	}
}
