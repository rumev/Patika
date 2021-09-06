
public class Course {

	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int note;
	int verbalNote;
	
	Course(String name,String code,String prefix){
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
		this.verbalNote=0;
	}
	
	public void addTeacher(Teacher t) {
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher=t;
			System.out.println("Teacher has been added!");
		}
		else System.out.println(t.name+"lecturer can not teach this course!");
	}
	
	public void printTeacher() {
		if(courseTeacher!=null) {
			System.out.println("Lecturer of "+this.name+courseTeacher.name);
		}
		else {
			System.out.println("There has not been attached a lecturer to course of "+this.name);
		}
	}
}
