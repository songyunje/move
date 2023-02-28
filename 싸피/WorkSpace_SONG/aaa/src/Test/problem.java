package Test;

import java.util.Scanner;

public class problem {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[][][] arr= new int[N][N][N];
	int sum = 0;
		for(int i=0; i<N;i++) {
			for(int j=i; j<N;j++) {
				for(int k=j; k<N;k++){
					arr[i][j][k] = i+j+k;
				}
			}
		}
		for(int i=0; i<N;i++) {
			for(int j=0; j<N;j++) {
				for(int k=0; k<N;k++){
					sum += arr[i][j][k];
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
