package pt2_ch14;

public class taxiTest {

	public static void main(String[] args) {
		

		Student Edward = new Student("Edward", 20000);
		
		Taxi taxi1 = new Taxi("참 좋은여행");
		
		Edward.takeTaxi(taxi1);
		
		Edward.showInfo();
		
		taxi1.showTaxiInfo();
		
	}

}
