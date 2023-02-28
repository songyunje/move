package pkg1;

import pkg1.pkg2.pkg3.Person;
// 패키지 명을 생략하고 쓰겠다.

public class PackageTest {
	public static void main(String[] args) {
		
		// 서로 다른 패키지에 있는 클래스 중에서
		// 하나를 골라서 쓸 때만 이렇게 쓸 수 있음
		
		Person p1 = new Person();
		System.out.println(p1.pkg);
		
		
		// 만약에 서로 다른 패키지에 있는 이름이 같은 클래스를
		// 두 개 이상 사용하고 싶다면 -> 패키지를 생략할 수 없고
		// 패지키명.클래스명 => 풀 패키지 이름
		
		pkg1.Person p2 = new pkg1.Person();
		pkg1.pkg2.Person p3 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p4 = new pkg1.pkg2.pkg3.Person();
		Person p5 = new Person();
		
		System.out.println(p2.pkg);
		System.out.println(p3.pkg);
		System.out.println(p4.pkg);
		System.out.println(p5.pkg);
	}

}
