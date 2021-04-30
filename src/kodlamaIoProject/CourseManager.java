package kodlamaIoProject;

public class CourseManager {
	
	public void addStudentsToCourse(Course course, Student[] students) {
		for (Student student : students) {
			if(course.getId() == student.getCourseId()) {
				System.out.println(student.getFirstName()+ student.getLastName() + " isimli kullanıcı " + course.getName() +" isimli kursa eklendi.");
			}
		}
	};
	
	public void addCourse(Course course) {
		System.out.println(course.getName() + " isimli kurs sisteme eklendi.");
	};
	
	public void listCourse(Course[] courses) {
		for (Course course : courses) {
			System.out.println(course.getName());
		}
	};
	
	public void removeCourse(Course course) {
		System.out.println(course.getName() + " isimli kurs sistemden silindi.");
	}
}
