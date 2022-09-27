package test;

public class Student {

	String name; 
	int money; 
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000); //버스를 탔을 때 1000원을 지불 
		this.money -=1000;
	}
	
//	public void takeSubway(Subway subway) {
//		subway.take(1200); //버스를 탔을 때 1000원을 지불 
//		this.money -=1200;
//	}
	
	public void showInfo() {
		System.out.println(name+"의 남은돈은 "+money);
	}
	
}
