package test01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체의 생성 : new 키워드 + 생성자 호출
		p1.name = "송윤제";
		p1.age = 26;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "오유정";
		p2.age = 26;
		p2.eat();
	}

}
