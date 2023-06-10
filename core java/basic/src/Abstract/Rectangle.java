package Abstract;

public class Rectangle extends Shape { 
	private int length;
	private int widht;
	
	  Rectangle(int l,int w)
	  {
		  length=l;
		  widht=w;
		  System.out.println(length);
		  System.out.println(widht);
	  }
	
	// public void setLength(int length)
	// {
		//this.length=length; 
	// }
	// public int getLength()
	// {
	
		//return length;
	// }
	// public void setWidht(int widht)
	// {
	//	 this.widht=widht;
	// }
	// public int getWieght()
	// {
	//	 return widht;
	// }

	@Override
	public void area() {
		int Rarea= length*widht;
		 System.out.println("area of Rectangle"+Rarea);
		   
		
	}

}
