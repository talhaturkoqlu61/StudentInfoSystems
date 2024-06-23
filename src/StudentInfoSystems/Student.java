package StudentInfoSystems;

public class Student {
	String name;
	String StuNo;
	int classes;
	Course course1;
	Course course2;
	Course course3;
	double average;
	boolean isPass;
	Student(String name,String StuNo,int classes,Course course1,Course course2,Course course3){
		this.name=name;
		this.StuNo=StuNo;
		this.classes=classes;
		this.course1=course1;
		this.course2=course2;
		this.course3=course3;
		this.average=0;
		
		
	}
	void addBulkExamNote(int note1,int note2,int note3) {
		if(note1>=0&&note1<=100) {
			this.course1.examnote=note1;
		}
		if(note2>=0&&note2<=100) {
			this.course2.examnote=note2;
		}
		if(note3>=0&&note3<=100) {
			this.course3.examnote=note3;
		}
	}
	void addBulkEvaluationNote(int note1,int note2,int note3) {
		if(note1>=0&&note1<=100) {
			this.course1.evaluationnote=note1;
			
		}
		if(note2>=0&&note2<=100) {
			this.course2.evaluationnote=note2;
			
		}
		if(note3>=0&&note3<=100) {
			this.course3.evaluationnote=note3;
		}
	}
	double calcAverage(Student student){
		student.average=((((student.course1.examnote*4)+(student.course1.evaluationnote))/5)+(((student.course2.examnote*4)+(student.course2.evaluationnote))/5)+(((student.course3.examnote*4)+(student.course3.evaluationnote)))/5)/3.0;
		return student.average;
	}
	boolean isPass(Student student){
		if(student.average>=50) {
			return true;
		}
		else {
			return false;
		}
	}
	void printNote(Student student) {
		System.out.println("Examnote of course1:"+student.course1.examnote+"<>"+"Evaluationnote of course1:"+student.course1.evaluationnote);
		System.out.println("Examnote of course2:"+student.course2.examnote+"<>"+"Evaluationnote of course2:"+student.course2.evaluationnote);
		System.out.println("Examnote of course3:"+student.course3.examnote+"<>"+"Evaluationnote of course3:"+student.course3.evaluationnote);
		
	}
	

}
