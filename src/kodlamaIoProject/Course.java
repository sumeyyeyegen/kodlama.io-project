package kodlamaIoProject;

public class Course {
	private int id;
	private String name;
	private Instructor instructor;

	public Course(int id,String name, Instructor instructor) {
		setId(id);
		setName(name);
		setInstructor(instructor);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
