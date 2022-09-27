package test;

public class Bus {

	String busName;
	int passengerCount;
	int money; 
	
	public Bus(String busName) {
		this.busName = busName;
	}
	
	public void take(int money) {
		
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busName+"의 승객은 "+passengerCount+"명, 수익은"+money+"입니다.");
	}
	
}
