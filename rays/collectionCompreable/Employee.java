package rays.collectionCompreable;

import java.lang.*;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String address;

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	@Override
	public String toString() {

		return id + " " + name + " " + address;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id == o.id) {
			return this.name.compareTo(o.name);
		}

		return this.id - o.id;
	}

}
