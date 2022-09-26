package test;

public class ch10Birth {

		private int year; 
		private int month;
		private int day;
		boolean isValid; 
		
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			if(year<1 || year>2023) {
				isValid = false;
			}			
			isValid = true;
			this.year = year;
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
		public void isValid() {
			if(isValid) {
				System.out.println(year+"년"+month+"월"+day+"일 입니다.");
			}
			if(isValid==false) {
				System.out.println("유효한 날짜 형식이 아닙니다.");
			}
		}
		
		
}
