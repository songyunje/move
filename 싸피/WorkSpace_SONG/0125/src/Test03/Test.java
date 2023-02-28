package Test03;



public class Test {
	public static void main(String[] args) {
		// 자식 클래스에서 추상 클래스에 없는 메서드를 추가해봅시다
		// eat
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		a1.eat(); // 왜 안될까?
		// 안되는 것을 해결하는 방법
		// 부모 클래스에 추상 메서드 혹은 일반 메서드를 정의해놔야
		// 부모 클래스 타입으로 참조했을 때 메서드 사용 가능!
		a1.speak();

		
	}

}
