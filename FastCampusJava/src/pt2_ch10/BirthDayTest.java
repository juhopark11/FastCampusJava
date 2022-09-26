package pt2_ch10;

public class BirthDayTest {
	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		date.setDay(35);
		date.setMonth(11);
		date.setYear(2021);
		
		date.showisValid();
		System.out.println(date.getIsValid());
	}
}

