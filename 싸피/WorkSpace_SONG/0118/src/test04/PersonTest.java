package test04;

import test04.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		int sum = p1.add(4, 5);
		double sum2 = p1.add(34.2,102.1);
		System.out.println(sum);
		System.out.println(sum2);
		
		
		p1.eat();
		p1.eat("탕수육");
		p1.eat("햄버거", 3);
		p1.eat(5, "피자");  // 파라미터의 순서가 달라도 됨!
	}

}
