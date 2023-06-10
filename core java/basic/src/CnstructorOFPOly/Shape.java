package CnstructorOFPOly;

public class Shape {

	private String color;
	private int borderwidth;
	
	 Shape()
	 {
		 
	 }
	 Shape(String c,int bw)
	 {
		 color=c;
		 borderwidth=bw;
		 System.out.println("color");
		 System.out.println(borderwidth);
		 
				 
	 }
    public void setColor( String color)
    {
    	this.color=color;
    }
    public String getColor()
    {
      return color;	
    }
    public void setBorderWidth( int borderwidth)
    {
    	this.borderwidth=borderwidth;
    }
    public int getBorderWidth()
    {
    	return borderwidth;
    }
     public double area()
     {
    	 return 0;
     }
	
}
