package Oop.Practice;

public class ThisRectangle extends ThisKeyword {
	private int length;
	private int breadth;
	  
	
	 public ThisRectangle(String color,int borderwidht,int length,int breadth)
	 {
		 super(color,borderwidht);
	 
      this .length=length;
      this .breadth=breadth;
	 }
	  public void getLength()
	  {
		  System.out.println("Area of length=" +length);
	  }
	  public void getBreadth()
	  {
		  System.out.println("Area of breadth="+breadth);
	  }

	   
		  
		    
		    
		    
		    
	   }
}