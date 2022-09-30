package test;

public class StudentTest {

	public static void main(String[] args) {
		
		Student person1 = new Student("person1", 5000); //사람을 만듦 (사람 객체 생성)
		
		Bus bus1 = new Bus("경기고속"); //버스를 만듦 (버스 객체 생성)
		
		person1.takeBus(bus1); //사람을 버스에 태움. 
		
		person1.showInfo(); // 사람의 상태를 보여달라. 
		bus1.showBusInfo(); // 버스의 상태를 보여달라. 
		
	}
}
