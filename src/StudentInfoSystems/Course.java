package StudentInfoSystems;

public class Course {
	String name;
	String ccode;
	int examnote;
	int evaluationnote;
	Teacher teacher;
	Course(String name,String ccode){
		this.name=name;
		this.ccode=ccode;
		this.examnote=0;
		this.evaluationnote=0;
	}
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(ccode)) {
			this.teacher=teacher;
		}
		else {
			System.out.println("'ccode' and 'teacher branch'does not match!");
		}
		
	}
	void printTeacher() {
		System.out.println("Teacher:"+this.teacher.name);
	}
	
	
}
