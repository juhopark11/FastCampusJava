package pt2_ch06;

public class StudentTest {

	public static void main(String[] args) {
		
//		Student studentLee = new Student();	
		
//		studentLee.grade = 3;
//		studentLee.studentName="KIm";
//		studentLee.studentNumber =12345;
		
		Student studentLee = new Student(12345, "Kim", 3);	
		System.out.println(studentLee.showStudentInfo());
		
	}
}