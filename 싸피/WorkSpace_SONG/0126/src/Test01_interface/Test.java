package Test01_interface;

public class Test {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		MyInterface mm = new MyClass();
		mm.method1();
		m.method1();
		m.method2();
		System.out.println(m.MEMBER_1);
		System.out.println(m.MEMBER_2);
	}

}
