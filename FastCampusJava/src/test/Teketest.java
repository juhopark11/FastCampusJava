package test;

public class Teketest {

	public static void main(String[] args) {
		
	
	student James = new student("James", 9000);
//	student Thomas = new student("Thomas", 8200);
	
	Bus bus100 = new Bus(100);
	James.takeBus(bus100);
	
//	Subway line1 = new Subway(1);
//	Thomas.takeSubway(line1);
	

	James.showInfo();
//	Thomas.showInfo();
	
	bus100.showBusInfo();
	
	}
	

}
