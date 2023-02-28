package test07_singleturn;

public class PersonTest {
	public static void main(String[] args) {
		//Person p1 = new Person(); // 싱글턴에서는 객체를 추가로 생성할 수 없음
		Person p1 = Person.getInstance();
		
		//p1.name ="송윤제"; // private 멤버변수에 접근 불가!
		//p1.setName("송윤제"); // public 메서드이므로 접근 가능!!!
		//p1.setAge(28); // setter를 이용해서 멤버 변수의 값을 수정 가능
	
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = Person.getInstance();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}

}
