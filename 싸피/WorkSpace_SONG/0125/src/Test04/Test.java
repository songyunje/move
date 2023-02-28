package Test04;



public class Test {
	public static void main(String[] args) {
		// 자식 클래스에서 추상 클래스에 없는 메서드를 추가해봅시다
		// eat
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		// a1.eat(); // 왜 안될까?
		// 안되는 것을 해결하는 방법
		// 1. 부모 클래스에 추상 메서드 혹은 일반 메서드를 정의해놔야
		//    부모 클래스 타입으로 참조했을 때 메서드 사용 가능!
		
		// 2. instanceof를 이용해서 형변환
		// -> instanceof 연산자
		//    객체가 해당 클래스로 만든 객체이거나
		//    객체가 해당 클래스의 조상 클래스로 만든 객체인 경우 true
		//    자식 클래스, 전혀 상관 없는 클래스로 만든 객체일 경우 false
		
		System.out.println(a1 instanceof Animal);
		System.out.println(a1 instanceof Cat);
		System.out.println(a1 instanceof Dog);
		
		if(a1 instanceof Cat) {
			Cat c = (Cat) a1;
			c.eat();
		}
		
		if(a2 instanceof Dog) {
			Dog d = (Dog) a2;
			d.eat();
		}
		
		if(a3 instanceof Person) {
			Person p = (Person) a3;
			p.eat();
		}
		
		// 조상 클래스에서 일반 메서드로 만드는 것 vs 추상 메서드로 만드는 것
		// 일반 메서드 -> 상속
		// 추상 메서드 -> 상속
		
		// (부모 클래스에서) 일반 메서드를 사용하는 경우
		// -> 자식 클래스에서 재정의하지 않고 넘어갈 수 있음
		
		// (부모 클래스에서) 일반 메서드, 추상 메서드를 둘 다 만들지 않고
		// 자식 클래스에서 독립적으로 만들어서 사용하는 경우
		// -> 다형성 활용 불가
		
		
		//a1.speak();

		
	}

}
