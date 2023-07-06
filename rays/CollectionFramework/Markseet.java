package rays.CollectionFramework;

public class Markseet implements Comparable<Markseet>{
	
	int id;
	String name;
	String add;
	public Markseet(int id,String name,String add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
		
	}
	@Override
	public int compareTo(Markseet o) {
		
		return this.id-o.id;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+add;
	}

}
