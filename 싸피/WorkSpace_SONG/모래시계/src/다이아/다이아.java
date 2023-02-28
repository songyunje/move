package 다이아;

import java.util.Scanner;

public class 다이아 {
	public static void main(String[] args) {
		int N = 1;
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if(j>=Math.abs(2-i) && j<5-Math.abs(2-i)) {
					System.out.printf("%3d", N++ );
				}
				else {
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
	}

}
