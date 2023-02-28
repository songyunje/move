package day0116;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i=0; i<n+1; i++) {
			if ( i%2 == 0) {
				ans += i;
			}
		}
		System.out.println(ans);
	}

}
