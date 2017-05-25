package abstractFactoryDP;

public class AbstractFactoryDPDemo {

	public static void main(String[] args) {
		
		User student = AbstractFactory.getUser(UserType.STUDENT);
				
		User teacher = AbstractFactory.getUser(UserType.TEACHER);
		
		User userStu = AbstractFactory.getUser(UserType.STUDENT);		
		
		System.out.println(student);
		System.out.println(teacher);
		System.out.println(userStu);


	}

}
