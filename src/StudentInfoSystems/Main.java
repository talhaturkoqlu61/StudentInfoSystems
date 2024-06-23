package StudentInfoSystems;

public class Main {
	public static void main(String[]args) {
		Teacher t1=new Teacher("Emine","05053536127","MATH");
		Teacher t2=new Teacher("Talha","05523025261","CMPSCN");
		Teacher t3=new Teacher("Buğrahan","05553016161","HST");
		Course c1=new Course("Maths","MATH");
		Course c2= new Course("Computer Science","CMPSCN");
		Course c3=new Course("History","HST");
		c1.addTeacher(t1);
		c2.addTeacher(t2);
		c3.addTeacher(t3);
		Student s1=new Student("Zeynep","111",9,c1,c2,c3);
		s1.addBulkExamNote(60, 40, 20);
		s1.addBulkEvaluationNote(80, 50, 40);
		System.out.println(s1.calcAverage(s1));
		System.out.println(s1.isPass(s1));
		s1.printNote(s1);
		
		
	}

}
