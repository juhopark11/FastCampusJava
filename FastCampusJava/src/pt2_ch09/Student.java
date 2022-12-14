package pt2_ch09;

public class Student {

	int studentID; 
	String studentName; //String은 new를 안해도 쓸 수 있음.
	
	Subject korea;
	Subject math;
	
	Student(int studentID, String studentName){
		
		this.studentID = studentID;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
//	public void showScore() {
//		int total = korea.score+math.score;
//		System.out.println(studentName+"의 총score는"+total);
//	}
	
	public int showScore() {
		return korea.score+math.score;
	}
	
}
