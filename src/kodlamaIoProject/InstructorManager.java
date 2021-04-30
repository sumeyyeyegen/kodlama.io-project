package kodlamaIoProject;

public class InstructorManager extends UserManager {
	public void addInstructor(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici egitmenlere eklendi.");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli egitmen silindi.");
	}
}
