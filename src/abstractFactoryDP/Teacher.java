package abstractFactoryDP;

public class Teacher extends User{

	Teacher()
	{
		this.name = "Teacher Name";
		this.password = "Teacher Password";
		System.out.println("Teacher object is created");
	}

	public String toString() {
		return "Teacher [name=" + name + ", password=" + password + "]";
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new Teacher();
	}
}
