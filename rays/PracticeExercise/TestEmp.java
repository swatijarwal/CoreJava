package rays.PracticeExercise;
import java.util.*;
public class TestEmp {

	public static void main(String[] args) {
     List list= new ArrayList();

     list.add(new Emp(2,"shivanshi","bhopal"));
     list.add(new Emp(1,"swati","indore"));
     list.add(new Emp(3,"mridula","sehore"));
     Collections.sort(list);
     for (Object object : list) {
       System.out.println(object);		
	}
     
    

	}

}
