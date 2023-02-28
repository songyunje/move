package day0116;

public class Test07_산술연산자 {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		// 정수끼리의 연산 -> 정수
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// 정수& 실수의 연산 -> 실수
		System.out.println((double)a/(double)b);
		System.out.println((double)a/b);
		System.out.println(a/(double)b);
		System.out.println((double)(a/b));
		
	}
}
