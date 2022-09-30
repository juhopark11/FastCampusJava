package pt2_ch19;

public class Car {
	
	private static int serialNum =1000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

}



