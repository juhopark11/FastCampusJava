package pt2_ch03;

public class Student {
	public int studentID;
	public String studentName;  
	public String address;
			
	public void showStudentInfo() { //void 받기만 할께~
		System.out.println(studentID+"학번학생이름은"+studentName + "," + address);
	}
	
	public String getStudentName() { //반환값으 타입이 문자(name)이니까 String 씀
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
		
	
}
