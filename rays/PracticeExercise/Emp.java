package rays.PracticeExercise;
import java.lang.*;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private String address;
	public Emp(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	  @Override
	public String toString() {
		
		return id+" "+name+" "+ address;
	}
	

	@Override
	public int compareTo(Emp o) {
		
		return this.id-o.id;
	}
	
	

}
