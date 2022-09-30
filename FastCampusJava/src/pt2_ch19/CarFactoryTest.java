package pt2_ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); //싱글톤 패턴. (객체 생성 안하고 바로 호출)
		Car mySonata = factory.createCar(); // createCar여기서 객체가 생성이 됨. 
		Car yourSonata = factory.createCar();
//		
//		System.out.println(mySonata.getCarNum());     //10001 출력
//		System.out.println(yourSonata.getCarNum());   //10002 출력
	}
}


//팩토리 안에 create car라는 메소드가 있고, 여기서 car를 new 해서 반환해서 객체를 생성해줌. 
// 여기는 생성을 해주는 매소드가 따로 있음. 
// 근데 Carnum이라는 시리얼 번호를 하나씩 

