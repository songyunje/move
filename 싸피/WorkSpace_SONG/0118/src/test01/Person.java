package test01;
// 모든 클래스는 특정 패키지(폴더)에 속해 있음
// 패키지 : 클래스가 모여있는 폴더

// class 키워드를 사용
public class Person {
	
	// 속성, 데이터, 필드, 변수
	String name;
	int age;
	
	// 생성자
	// 클래스명과 같다
	// 반환명을 지정 x (메서드와 다름)
	public Person() {
	}
	
	// 메서드
	public void eat() {
		System.out.println(name + "이 식사를 합니다.");
	}
}
