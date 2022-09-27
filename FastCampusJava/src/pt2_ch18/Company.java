package pt2_ch18;

public class Company {

	//유일한 인스턴스는 내부에서 private로 만듦. 하나만 있을꺼니깐 static으로 만듦. 
	//유일한 객체가 됨. 그렇다면, 이걸 쓸 수 있도록 해야겠지. 
	private static Company instance = new Company();
	
	private Company() {
		//요 안에 코드를 넣으면 되는데, 지금 넣을게 없음. 
	}
	
	// 위에 유일한 객체를 쓸 수 있도록 해줌. 
	// 외부에서 getInstance를 써야 하는데, 일반메소드면 인스턴스  생성하고, 얘를 호출함. 
	// 그래서 안그럴 수 있도록 static으로 만들어줌. 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
	


//싱글톤 순서. 
//0. 단 하나의 객체만 있어야 하는 경우 사용. 
// (배경) defaule로 두면 외부에서 company를 여러개 생성할 수 있음. 
// 1.외부에서 company를 맘대로 new할 수 없도록 생성자를 하나 제공. private Company(){}
//
//
//요약 : Company를 외부에서 생성할 수 없고, 내부에 private로 하나 생성되어있고, getInstance 하나 제공해줌. 
//      그래서 getInstance만으로 사용할 수 있다.
//
//
//
//
//
//
//
