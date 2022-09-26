package pt2_ch06;

public class Student {
	// 속성
	public int studentNumber; 
	public String studentName; 
	public int grade; 
	//기능
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber; //this를 쓰면 멤버변수를 가리킴
		this.studentName = studentName; 
		this.grade = grade; 
		
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은"+studentNumber+"이고"+grade+"입니다";
	}

	
}

//웹페이지 회원가입시 넘어온 파라미터를 가지고 그 객체가초기화 되어야 하고 그 값을 db로 넘겨야 함. 
