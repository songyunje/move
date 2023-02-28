package day0116;

public class Test08_비교연산자 {
	public static void main(String[] args) {
		int a = 10;
//		System.out.println(a > 10);
////		System.out.println(false);
//		System.out.println(a != 10);
//		System.out.println(a >= 10);
//		
//		System.out.println(a == 10);
//		System.out.println(a != 10);
		
		// 문자열의 비교!! 
		// 반드시 equals 메서드를 사용
		String s1 = "Hi";
		String s2 = "Hi";
		String s3 = new String("Hi");
		// 주소값의 비교
		System.out.println(s1 == s2); // 주소값이 같다
		System.out.println(s1 == s3); // 참조값이 같다
		// 주소값이 아닌 실제 문자의 값을 비교
		System.out.println(s1.equals(s3)); // 문자열 값이 같다.
		System.out.println(s1.equals(s3));
	}
}
