package pt2_ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		//일반메소드면 new 해야하는데, 바로 가져다쓰도록 getInstance를 함. 이게 싱글톤. 
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		
		
		
//		Company company1 = Company.getInstance();
//		Company company2 = Company.getInstance();
//		
		System.out.println(company1);
		System.out.println(company2);
		
		//예시 하나더. 유일한 객체를 제공할 때 이렇게 싱글톤 패턴을 쓴다. 
		Calendar calendar = Calendar.getInstance(); 
	}
}
