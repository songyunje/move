package test03_super;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("피카츄",6,"자바");
		//st.
		st.eat(); // 오버라이드 하지 않았으므로, 부모의 매서드를 그대로 사용
	}

}
