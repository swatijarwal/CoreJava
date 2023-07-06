package rays.PracticeExercise;
import java.util.*;
public class Mark implements Comparator<Mark> {
	private int id=0;
	private String name=null;
	private String address= null;
	public int salary=0;
	public Mark(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	public int compare(Mark o1, Mark o2) {
		
		
		return o1.id-o2.id;
	}
      
}
