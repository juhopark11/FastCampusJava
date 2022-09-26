package pt2_ch03;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) { //static을 사용해서 객체없이 호출하게 해높음
		int result;
		result = num1 + num2;
		return result;
	} 
	
	public static void sayHello(String greeting) { //void여서 받고 끝냄. 그래서return없음
		System.out.println(greeting);
	}
	
	public static int calcSum() { //반환만하고, 매개변수는 없음()
		
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2); // 메소드가 반환하는걸 total에 담음
		System.out.println(total);
		
		sayHello("안녕하세요");// 반환 없이 그냥 넣음(메소드가 void 임)
		int num = calcSum(); //calcSum이 반환하는걸 num에 담음 
		System.out.println(num);
	}
}

