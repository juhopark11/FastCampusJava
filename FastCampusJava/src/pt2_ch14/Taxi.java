package pt2_ch14;

public class Taxi {

	String taxiName; 
	int money; 
	
	
	public Taxi(String taixName) {
		this.taxiName = taxiName; 
	}
	
	public void take(int money) {
		money+=money;		
	}
	
	public void showTaxiInfo() {
		
		System.out.println(taxiName+"수입은"+money+"입니다.");
	}
}
