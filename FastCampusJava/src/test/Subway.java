package test;

public class Subway {
	
	int line;
	int balance;
	int passengerCount;

	
	public Subway(int line) {
		
		this.line = line;
	}
	
	public void take(int subway) {
		balance+= subway;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		
		System.out.println(line+"의 승객은"+passengerCount+"이고 총 수익"+balance+"입니다.");
	}
	
}
