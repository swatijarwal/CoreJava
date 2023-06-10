package Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int wieght;
	
	Rectangle( int l,int w)
	{
		length=l;
		wieght=w;
		System.out.println(length);
		System.out.println(wieght);
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
    public int getLength()
    {
    	return length;
    }
    public void setWiegth(int wieght)
    {
    	this.wieght=wieght;
    }
    public int getWiegth()
    {
    	return wieght;
    }
}
