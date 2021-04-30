package kodlamaIoProject;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setNationalIdentity("12345678912");
		instructor1.setPassword("1233");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setStudentId(1);
		student1.setFirstName("Sümeyye");
		student1.setLastName("Yeğen");
		student1.setNationalIdentity("12345678913");
		student1.setEmail("sumeyyeyegen746@gmail.com");
		student1.setPassword("1234");
		student1.setCourseId(1);
		
		Student student2 = new Student();
		student2.setId(3);
		student2.setStudentId(2);
		student2.setFirstName("Atil");
		student2.setLastName("Aydin");
		student2.setNationalIdentity("12344555655");
		student2.setEmail("atil@gmail.com");
		student2.setPassword("1223");
		student2.setCourseId(2);
		
		Student[] students = new Student[] {student1,student2};
		
		User[] users = new User[] {instructor1,student1,student2};
		
		
		Course course1 = new Course(1, "Java + React Kamp",instructor1);
		Course course2 = new Course(2, "C# + Angular Kamp",instructor1);
		
		Course[] courses = new Course[] {course1,course2};
		
		System.out.println(users.length);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course2);
		courseManager.addStudentsToCourse(course2, students);
		courseManager.listCourse(courses);
		courseManager.removeCourse(course1);
		
		System.out.println("------------------------------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.addUser(instructor1);
		userManager.addUser(student2);
		userManager.addUser(users);
		
		System.out.println("------------------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.delete(student2);
		studentManager.update(student1);
		
		System.out.println("------------------------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.update(instructor1);
		

	}

}
