package pt2_ch14;

public class Bus {

	String busNumber;
	int passengerCount;
	int money;
	
	public Bus(String busNumber) {
		this.busNumber = busNumber;
	}
	
	// 이 부분이 협력이 일어나고 있다. 
	public void take(int money) { 
		this.money += money;
		passengerCount ++; //돈을 받았다는 것은 승객이 늘었다는 말. 
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"의 승객수"+passengerCount+"이고, 보유수익은"+money+"입니다.");
	}
}
