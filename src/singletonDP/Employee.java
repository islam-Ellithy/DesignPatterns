package singletonDP;

public class Employee {

	private static volatile Employee instance;

	public String name;
	public String company;
	public int salary;

	private Employee() {
		name = "Islam";
		company = "Google";
		salary = 10000000;
	}

	public static Employee createEmployee() {
		if (instance == null) {
			instance = new Employee();
		}
		return instance;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", salary="
				+ salary + "]";
	}

}
