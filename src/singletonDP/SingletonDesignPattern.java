package singletonDP;

public class SingletonDesignPattern {

	public static void main(String[] args) {

		// default object name = islam , company = google , salary = 1000000
	

		Employee ahmed = Employee.createEmployee();

		System.out.println(ahmed);
	}

}
