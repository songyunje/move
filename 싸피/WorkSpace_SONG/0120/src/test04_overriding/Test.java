package test04_overriding;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("피카츄",6,"자바");
		//st.
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의할 수 있다.
	}

}
