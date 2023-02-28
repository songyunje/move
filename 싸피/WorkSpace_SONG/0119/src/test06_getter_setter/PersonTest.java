package test06_getter_setter;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.name ="송윤제"; // private 멤버변수에 접근 불가!
		p1.setName("송윤제"); // public 메서드이므로 접근 가능!!!
		p1.setAge(28); // setter를 이용해서 멤버 변수의 값을 수정 가능
		p1.setAge(-10);
		p1.setAge(300);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
