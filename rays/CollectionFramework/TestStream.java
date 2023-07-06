package rays.CollectionFramework;
import java.util.*;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(200);
		
		list.add(100);
        list.add(100);
		
      list.stream().sorted().distinct().forEach(e-> {System.out.println(e);});

	}

}
