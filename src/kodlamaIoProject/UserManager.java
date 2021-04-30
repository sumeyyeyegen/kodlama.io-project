package kodlamaIoProject;

public class UserManager {
	public void addUser (User user) {
		System.out.println(user.getFirstName() + " isimli kullanıcı eklendi.");
	}
	
	public void addUser (User[] users) {
		for (User user : users) {
			addUser(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici guncellendi.");
	}
}
