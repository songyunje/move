package day0116;

public class Test09_논리연산자 {
	public static void main(String[] args) {
		int a = 10;
		// short circuit evaluation
		System.out.println(++a < 5 && ++a < 10);
		System.out.println(a);
		
		System.out.println(++a > 5 || ++a < 10 );
		System.out.println(a);
	}
}
