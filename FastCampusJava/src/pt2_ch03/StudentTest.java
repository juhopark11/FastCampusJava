package pt2_ch03;

public class StudentTest {
	public static void main(String[] args) {
	
	Student studentLee = new Student(); // 가져올애 변수명(참조변수) = 생성자 가져올애()모든것;
	//참조변수 역할 : 복사해서 넣어놓을 곳. 왜냐면 본체(Student)는 다 같이 써야 하니까!
	// 이렇게 학생 한멱을 생성되는 객체를 '인스턴스'라고 함. 
	// 위 student 클래스를 통해서 여러개의 인스턴스(학생)이 생성될 수 있음.
	
	 studentLee.studentID = 12345; 
	 studentLee.setStudentName("Lee"); 
	 studentLee.address = "서울시 강남구"; 
	
	 studentLee.showStudentInfo();

	 Student studentKim = new Student();
	 
	 studentLee.studentID = 67890; 
	 studentLee.setStudentName("Kim"); 
	 studentLee.address = "서울시 종로구"; 
	
	 studentLee.showStudentInfo();	
	}
}
