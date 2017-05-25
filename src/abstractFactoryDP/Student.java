package abstractFactoryDP;

public class Student extends User{

	Student()
	{
		this.name = "Student Name";
		this.password = "Student Password";
		System.out.println("Student object is created");
	}

	public String toString() {
		return "Student [name=" + name + ", password=" + password + "]";
	}

	@Override
	public User createUser() {
		return new Student();
	}
	
	
	
}
