package Abstract;

public class Triangle  extends Shape{
	private int base;
	private int height;

	
public void setBase(int base)
	{
		this.base=base;
	}
    public int getBase()
    {
    	return base;
    }
    public void setHeight(int height)
   {
    	this.height=height;
    }
    public int getHeight()
    {
    	return height;
    }
	@Override
	public void area() {
		int Tarea= base*height/2;
		System.out.println("Area of Tringle"+ Tarea);
		
	}
    
}
