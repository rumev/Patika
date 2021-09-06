
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course math = new Course("Mathematic", "MAT101", "MAT");
        Course physic = new Course("Physic", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHE101", "CHE");
        
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHE");
        
        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);
        
        Student s1 = new Student("Ýnek Þaban", 4, "140144015", math, physic, chemistry);
        s1.addExamNote(50, 20, 40);
        s1.addVerbalNote(60, 40,70);
        s1.isPass();
        
        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physic, chemistry);
        s2.addExamNote(100, 50, 40);
        s2.addVerbalNote(90, 50, 50);
        s2.isPass();
        
        Student s3 = new Student("Hayta Ýsmail", 4, "221121312", math, physic, chemistry);
        s3.addExamNote(50, 20, 40);
        s3.addVerbalNote(60, 30, 50);
        s3.isPass();
	}

}
