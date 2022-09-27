package pt2_ch14;


public class Taxi {

	String Company; 
	int money; 
	
	public Taxi(String Company) {
		this.Company = Company; 
	}
	
	public void take(int money) {
		this.money+=money;		
	}
	
	public void showTaxiInfo() {
		System.out.println(Company+" 수입은 "+money+"입니다.");
	}
}