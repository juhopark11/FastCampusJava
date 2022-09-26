package pt2_ch12;

public class Person {
	
	String name; 
	int age; 
	
	public Person() {
		
		this("Kim", 13);
	}
	
	public Person(String name, int age) {
		
		this.name = name; 
		this.age = age; 
	}
	
	public void showPerson() {
		
		System.out.println("이름은"+name+"나이는"+age+"입니다.");
	}

	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
	}

}
