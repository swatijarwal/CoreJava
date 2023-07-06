package rays.CollectionFramework;



public class Student implements Comparable<Student> {
	int id;
	String name;
	String address;
public Student()
{
	
}
public Student(int id, String name,String address)	

	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
      @Override
    public String toString() {
    
    	return id+" "+name+" "+address;
    }
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
      



}
