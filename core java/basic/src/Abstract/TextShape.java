package Abstract;

public class TextShape {
	public static void main(String[]args)
	{
		Rectangle r= new Rectangle( 20,50);
		Circle c= new Circle();
		Triangle t= new Triangle();
		
		//r.setLength(10);
		//r.setWidht(20);
		//System.out.println(r.getLength());
	//	System.out.println(r.getWieght());
		
		c.setCircle(10);
		//System.out.println(c.getCircle());
		
	    t.setBase(20);
		t.setHeight(10);
		//System.out.println(t.getBase());
		//System.out.println(t.getHeight());
		r.area();
		c.area();
		t.area();
	}

}
