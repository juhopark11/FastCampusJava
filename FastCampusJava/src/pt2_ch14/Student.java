package pt2_ch14;

//James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
//James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
//Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
//두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.


public class Student {

	String studentName; 
	int money; 
	
	public Student(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
	}


	//버스를 타면 takeBus가 호출되고, 지하철을 타면 takeSubway가 호출되면 된다. 즉, 모두 호출이 아닌 필요한것만 호출되면 된다.
	//학생이 버스를 탄다. 어떤 버스를 탔는지가 매개변수로 넘어온다. 
	public void takeBus(Bus bus) {
		bus.take(1000); //버스를 타면 1000원을 지불한다. bus를 만들고 take를 만들자. 
		this.money -=1000;
	}
	
	//학생이 지하철을 탄다. 지하철 정보가 매개변수로 넘어온다. 
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -=1200;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}

	public void showInfo() {
		
		System.out.println(studentName+"의 남은돈은 "+money+"원 입니다.");
	}
	
}

//버스를 타면 takeBus가 호출되고, 지하철을 타면 takeSubway가 호출되면 된다. 


