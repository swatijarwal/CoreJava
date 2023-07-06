package rays.CollectionFramework;
import java.util.*;

public class TestForEach {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(300);
		//list.add(300);
		list.forEach(e->{System.out.println(e);});

	}

}
