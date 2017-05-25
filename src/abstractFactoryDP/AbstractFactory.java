package abstractFactoryDP;

public abstract class AbstractFactory {

	private final static Student STUDENT_USER = new Student();
	private final static Teacher TEACHER_USER = new Teacher();
	
	public static User getUser(UserType type) {
		User user = null;
		switch (type) {
		case STUDENT:
			user = STUDENT_USER;
			break;
		case TEACHER:
			user = TEACHER_USER ;
			break;
		}
		return user;
	}
}
