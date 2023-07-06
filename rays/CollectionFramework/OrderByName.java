package rays.CollectionFramework;

import java.util.Comparator;

public class OrderByName implements Comparator<Markseet> {

	@Override
	public int compare(Markseet o1, Markseet o2) {
		if(o1.name==o2.name)
		{
			return o1.add.compareTo(o2.add);
		}

		return o1.name.compareTo(o2.name);
	}


}
