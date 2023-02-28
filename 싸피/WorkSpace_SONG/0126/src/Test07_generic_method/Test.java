package Test07_generic_method;

public class Test {
	public static void main(String[] args) {
		
		// 제네릭 클래스의 변수를 선언
		// 제네릭 클래스로 객체를 만듬
		// 선언과 객체 생성시 타입을 지정
		GenericBox<String> strbox = new GenericBox<String>();
		strbox.setData("Hello Generic!");
		System.out.println(strbox.getData());
		strbox.genericMethod(123);
		
		
		
		
	}

}

