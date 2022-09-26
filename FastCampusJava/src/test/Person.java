package test;

public class Person {

	
	int orderNum; 
	int orderHp;
	String address;
	int orderDate;
	String orderHour;
	
	
	public Person(int orderNum, int orderHp, String address, int orderDate, String orderHour) {
	
		this.orderNum = orderNum;
		this.orderHp = orderHp;
		this.orderDate = orderDate;
		this.orderHour = orderHour;
		
	}
	
	public void showPerson() {
		
		System.out.println("주문접수번호"+orderNum+"\n주문핸드폰번호"+orderHp+"\n주소"+address+"\n날짜"+orderDate+"\n시간");
		
	}
	
}
