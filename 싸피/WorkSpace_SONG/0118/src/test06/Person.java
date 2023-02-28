package test06;

public class Person {
	
	// static 키워드 -> 클래스 변수 
	// 이 클래스로 생성되는 모든 인스턴스가 공유
	static String species = "호모 사피엔스 사피엔스";
	
	// static 키워드가 없으면 -> 인스턴스 변수
	String name;
	int age;
	
	// 생성자를 만들지 않고...
	// 만약에 설계도에 생성자가 하나도 없다면
	// JVM이 기본생성자를 추가해줌
	// Person() {};
	
	public Person() {
		this("하이디", 28);  // Person("하이디", 28)
	}
	
	// 파라미터가 있는 생성자
	public Person(String name, int age) {
		// this 키워드 : 인스턴스의 멤버에 접근
		this.name = name;
		this.age = age;
	}
	
	
	// 메서드 오버로딩: 이름이 같은 메서드 여러 개을 만들 수 있다.
	// 파라미터가 달라야 함!
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double d, double e) {
		return d+e;
	}
	
	// 반환형만 다른 것은 안된다!
//	public int add(double a, double b) {
//		return (int) a+b;
//	}
	
	
	
	// 메서드 오버로딩의 장점
	// - 다양한 자료형에 대해 메서드를 만들 때
	// - 이름을 똑같이 할 수 있음
	// addInt(), addDouble()
	
	
	
	
	// 메서드의 종료
	// -블록의 끝을 만날 때
	// -return문을 만날 때(void에서도 return문을 쓸 수 있음)
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability<0.9999)
			return;
		System.out.println("게임을 합니다.");
		System.out.println("Lol 영상을 시청합니다.");
	}
	
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	
	// 메서드 오버로딩
	public void eat() {
		
		// 지역 변수
		System.out.println("식사를 합니다.");
		this.sleep();
	}
	
	public void eat(String dish) {
		System.out.println(dish+"를 먹습니다.");
	}
	
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"번 먹습니다.");
	}
	
	public void eat(int times, String dish){
		System.out.println(times+"번 "+dish+"를 먹습니다.");
	};
	 
}
