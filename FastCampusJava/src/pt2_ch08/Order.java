package pt2_ch08;

public class Order {

	int orderNum; 
	int phoneNum;
	String address;
	int orderDate;
	int orderTime ;
	
	public Order(int orderNum, int phoneNum, String address, int orderDate, int orderTime) {
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime; 
	}
	
	public String showOrderInfo(){
		return "주문 접수 번호 :"+orderNum+"\n주문 핸드폰 번호:"+phoneNum+"\n주소:"+address+"주문날짜:"+orderDate+"\n시간:"+orderTime;
	}
	
	
}
