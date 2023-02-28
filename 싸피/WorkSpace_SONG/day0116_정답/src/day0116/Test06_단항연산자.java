package day0116;

public class Test06_단항연산자 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(-a);
		System.out.println(a);
		System.out.println(~a);
		System.out.println(a);
		a = ~a;
		System.out.println(a);
		a = ~a;
		System.out.println(a);
		System.out.println((float)a);
	}
}
