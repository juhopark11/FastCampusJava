package test;

public class Bus {

	
	int num;
	int balance;
	int passengerCount;
	
	
	public Bus(int num) {
		
		this.num = num;
	}
	
	public void take(int balance) {
		
		this.balance += balance;
		passengerCount++;
	}
	
	public void showBusInfo() {
		
		System.out.println(num+"번 버스총액"+balance+"\n승객수"+passengerCount);
	}
	
}
