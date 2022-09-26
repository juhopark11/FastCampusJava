package pt2_ch08;

public class OrderTest {
	public static void main(String[] args) {
	
		Order myOrder = new Order(202011023, 82105678, "서울시 강남구 역삼동", 20201212, 1233);
		System.out.println(myOrder.showOrderInfo());
	
	}
}