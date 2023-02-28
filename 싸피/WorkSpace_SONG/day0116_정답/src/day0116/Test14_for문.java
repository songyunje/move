package day0116;

public class Test14_for문 {
	public static void main(String[] args) {
		// 10번 반복
		// 밖으로 일부 빼내기
		// 일부 생략 가능
		// 생략하면 무한루프가 되기도 함.
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		// a부터 b까지 반복
		int a = 3;
		int b = 7;
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
}
