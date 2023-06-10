package Inheritance;

public class Shape {
	private String color;
	private int borderwidth;
	 
	Shape(){
		
	}
	
   public void setColor(String color)
   {
	   this.color=color;
   }
   public String getColor()
   {
	   return color;
   }
   public void setBorderWidth(int borderwidth)
   {
	   this.borderwidth=borderwidth;
   }
   public int getBorderWidth()
   {
	   return borderwidth;
   }
}
