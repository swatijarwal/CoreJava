package constructor;

public class Shape {
   private String color;
   private int borderwidth;

  public Shape()
  {
    
  }
  public Shape(int bw,String c)
  {
	  borderwidth = bw;
	  color=c;
	  System.out.println(borderwidth);
	  System.out.println(color);
	  
  }
    public void setColor(String color)
    {
    	this.color=color;
    	System.out.println(color);
    }
      public String getColor()
      {
    	  return color;
      }
       public void setBorderWidth(int borderwidth) {
    	   this.borderwidth=borderwidth;
    	   
       }
       public int getBorderWidth()
       {
    	   return borderwidth;
       }
} 