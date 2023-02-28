package Java_서울_06_송윤제;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 N 입력
		int N = sc.nextInt();
		
		// 블랭크를 제외한 부분에 +출력
		for (int i=0;i<N;i++) {
			for (int j=0;j<2*N-1;j++) {
				if(j>=i && j<2*N-1-i ) {
					System.out.print("+");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}

}
