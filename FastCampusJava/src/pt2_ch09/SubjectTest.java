package pt2_ch09;

public class SubjectTest {
 	public static void main(String[] args) {
 		
 		Student studentLee = new Student(1234, "Lee");
 		studentLee.setKoreaSubject("국어",100);
 		studentLee.setMathSubject("수학",90);
 		
 		Student studentKim = new Student(5678, "Lee");
 		studentKim.setKoreaSubject("국어",80);
 		studentKim.setMathSubject("수학",60);
 		
 		System.out.println(studentLee.showScore());
 		System.out.println(studentKim.showScore());
// 		studentKim.showScore();
// 		studentLee.showScore();
 		
 	}
}
