package pt2_ch10;

public class BirthDay {
	
	private int day; // 외부 접근 불가. 
	private int month;
	private int year;
	
	private boolean isValid; 
	 
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day<1 || day>31) {
			isValid = false;
		}
		else {
			isValid = true; 
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showisValid() {
		if(isValid) {
			System.out.println(year+"년"+month+"월"+day+"일");
		}
		else {
			System.out.println("유효한 날짜가 아닙니다");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
	}
	
}
