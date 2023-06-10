package constructor;

public class Tringle  {
	private int base;
	private int hieght;
	Tringle()
	{
		
	}
	Tringle(int b,int h)
	{
		base=b;
		hieght=h;
		System.out.println(base);
		System.out.println(hieght);
	}
	
	public void setBase(int base)
	
	{
		this.base=base;
	}
     public int getBase()
     {
    	 return base;
     }
     public void setHieght(int hieght)
     {
    	 this.hieght=hieght;
     }
}
