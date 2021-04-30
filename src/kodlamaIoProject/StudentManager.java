package kodlamaIoProject;

public class StudentManager extends UserManager {
	public void addStudent(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici öğrenci olarak eklendi.");
	}
	
	@Override 
	public void delete(User user) {
		System.out.println(user.getFirstName() +" isimli öğrenci silindi.");
	}
	
	@Override 
	public void update(User user) {
		System.out.println(user.getFirstName() +" isimli öğrenci güncellendi.");
	}
}
