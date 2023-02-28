package test06_object;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("피카츄",6,"자바");
		//st.
		st.eat(); // 필요하다면 자식 클래스에서 부모의 메서드를 재정의할 수 있다.
		
		st.toString();
		System.out.println(st.toString()); // Object의 메서드를 상속 받고 있다.
		// 1. 주소값이 나온다. 2. 재정의한대로 나온다.  ans) 2!
	
		
		
		Student st2 = new Student("피카츄",6,"자바");
		System.out.println(st==st2); //다른 객체, 주소값이 다르기 때문에...
		System.out.println(st.equals(st2)); // 원래는 다르게 나옴, 주소값을 비교하고 있으니까.
		                                    // 이름만 같아도 같다고 override했으므로 같게 나옴.
		Object o = new Object();
		o.equals(st);
		
		// 이름만 같으면 같은 사람(학생)이다!
		
		//집합
		Set<Student> set = new HashSet<>();
		set.add(st);
		set.add(st2);
		
		System.out.println(set.size()); // 집합에 들어있는 원소의 개수
		// set에서는 동일성을 판단하기 위해서 equals(), hashcode();
		// hahcode를 재정의하고 나서야 두 객체를 같은 것으로 봄.
		
	}

}
