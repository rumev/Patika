
public class Student {

	String name,studentNumber;
	int classes;
	Course math;
	Course physic;
	Course chemistry;
	double average;
	boolean isPass;
	
	
	Student(String name,int classes,String studentNumber,Course math,Course physic,Course chemistry){
		this.name=name;
		this.studentNumber=studentNumber;
		this.classes=classes;
		this.math=math;
		this.physic=physic;
		this.chemistry=chemistry;
		this.isPass=false;
	}
	
	public void addExamNote(int math,int physic,int chemistry) {
		if(math>=0&&math<=100) {
			this.math.note =math;
		}
		
		if(physic>=0&&physic<=100) {
			this.physic.note=physic;
		}
		if(chemistry>=0&&chemistry<=100) {
			this.chemistry.note=chemistry;
		}
	}
	public void addVerbalNote(int math,int physic,int chemistry) {
		if(math>=0&&math<=100)this.math.verbalNote=math;
		if(physic>=0&&physic<=100)this.physic.verbalNote=physic;
		if(chemistry>=0&&chemistry<=100)this.chemistry.verbalNote=chemistry;
	}
	
	public void calcAverage() {
		this.average=(this.math.note*0.8+this.math.verbalNote*0.2
				+this.physic.note*0.8+this.physic.verbalNote*0.2
				+this.chemistry.note*0.8+this.chemistry.verbalNote*0.2)/3;
	}
	
	public boolean isCheckPass() {
		calcAverage();
		return this.average >55;
	}
	
	public void isPass() {
		if(this.math.note==0||this.physic.note==0||this.chemistry.note==0) {
			System.out.println("Notes has not been entered correctly, Please Check Notes!!");
		}
		else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Average is : "+this.average);
			
			if(this.isPass)System.out.println("Class Passed!");
			else System.out.println("Class is not Passed!");
		}
	}
	
	public void printNote() {
		System.out.println("=========================");
		System.out.println("Student :"+this.name);
		System.out.println("Math Exam Note is : "+this.math.note+" Verbal Note is : "+this.math.verbalNote);
		System.out.println("Physic Exam Note is : "+this.physic.note+" Verbal Note is : "+this.physic.verbalNote);
		System.out.println("Chemistry Exam Note is : "+this.chemistry.note+" Verbal Note is : "+this.chemistry.verbalNote );
	}
}
