package day0116;

import java.util.Scanner;

public class Test16_do_while문 {
	public static void main(String[] args) {
		// 1을 입력받으면 계속
		// 1 이외의 값이면 종료
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		do {
			System.out.println("블록을 실행합니다.(단, 첫번째에 한해서는 무조건 실행해요. 0이든 1이든 상관없어요.)");
			num = sc.nextInt();
		} while(num == 1);
		System.out.println("프로그램의 끝.");

	}
}
