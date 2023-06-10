package AbstractToCons;

public class RectCons extends Shape {
	private int length;
	private int widht;
	RectCons(int l, int w)
	{
		length=l;
		widht=w;
		System.out.println(length);
		System.out.println(widht);
	}
	@Override
	public void area() {
		int Rarea=length*widht;
		System.out.println("Area of Rectangle"+Rarea);
		
	}

}
