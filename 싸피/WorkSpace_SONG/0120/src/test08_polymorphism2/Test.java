package test08_polymorphism2;



public class Test {
	public static void main(String[] args) {
		
		Student st = new Student("야도란",6,"자바");
		Person p =st;
		
		Student st3 = (Student)p;
		st3.study();
		
		Person p2 = new Person("피죤투",7);
		Student st2= (Student)p2;
		//st2.study(); -> 에러
	
//		st2.major = "aaa";
//		System.out.println(st2.toString());
		
	}

}
