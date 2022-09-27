package pt2_ch16;

public class Employee {

	private static int serialNum =1000; 
		
	private int employeeId; 
	private String employeeName; 
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum; //새로만든것(멤버변수)에다가 복사해줌.
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int id) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName; 
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
