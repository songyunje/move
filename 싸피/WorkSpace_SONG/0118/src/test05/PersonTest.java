package test05;

import test05.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("곤잘레스",28);
		Person p2 = new Person("레오나르도",29);
		Person p3 = new Person("라울",30);
		Person p4 = new Person();
		
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p4.name);
	}

}
