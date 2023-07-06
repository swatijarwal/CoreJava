package rays.PracticeExercise;

import java.util.Comparator;

public class FirstNameSorting implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.firstName==o2.firstName)
		{
			return o1.lastName.compareTo(o2.lastName);
		}
		
		return o1.firstName.compareTo(o2.firstName);
	}
	

}
