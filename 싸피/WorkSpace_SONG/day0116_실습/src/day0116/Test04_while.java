package day0116;

import java.util.Scanner;

public class Test04_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1을 입력 받으면 계속 반복
		// 그 외의 값을 입력 받으면 종료(반복 x)
		int num =sc.nextInt();
		while(num==1) {
			System.out.println("블록을 실행합니다");
			num = sc.nextInt();
		}
	}

}
