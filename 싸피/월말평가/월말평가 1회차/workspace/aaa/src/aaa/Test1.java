package aaa;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		

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
