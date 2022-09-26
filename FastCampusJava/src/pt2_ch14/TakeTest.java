package pt2_ch14;

public class TakeTest {
	public static void main(String[] args) {
		
	Student studentJ = new Student("James", 5000);	
	Student studentT = new Student("Thomas", 1000);	
		
	Bus bus100 = new Bus(100);
	Bus bus200 = new Bus(200);
	
	studentJ.takeBus(bus100);

	Subway blueSubway = new Subway(1);
	studentT.takeSubway(blueSubway);
	
	studentJ.showInfo();
	studentT.showInfo();
	
	bus100.showBusInfo();
	blueSubway.showBusInfo();
	
	bus200.showBusInfo();
	
	}
}
