package Oop.Practice;

public class ThisKeyword {
	private String color;
	private int borderwidth;
	   

	ThisKeyword()
	{
		System.out.println("1st const");
		
	}
	ThisKeyword(String color)
	{
		this();
		
		System.out.println("2nd const");
		
	}
	 ThisKeyword(String color,int borderwidth)
	 {
		 this(color);
		 
		 
		 System.out.println("3rd const");
		 this.color=color;
		this.borderwidth=borderwidth;
	 }
	   
	  public void getColor()
	 {
		 System.out.println(color);
	 }
	 public void getBorderWidth()
	 {
		  System.out.println(borderwidth);
		  
	 } 
       public double area()
       {
		return 0;
    	   
       }
	 
		 
	 
	  }

