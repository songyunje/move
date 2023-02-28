package day0116;

import java.util.Scanner;

public class Test15_while문 {
	public static void main(String[] args) {
		// 1을 입력받으면 반복
		// 1 이외의 값이면 종료
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num == 1) {
			System.out.println("블록을 실행합니다.");
			num = sc.nextInt();
		}
	}
}
