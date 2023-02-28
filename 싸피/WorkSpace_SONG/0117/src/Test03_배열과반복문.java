import java.util.Arrays;
import java.util.Scanner;

public class Test03_배열과반복문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for(int i=0;i<5;i++) {
			scores[i] = sc.nextInt();
		}
		
		// 전통적인 방식
//		for(int i=0;i<5;i++) {
//			System.out.println(i+"번째 정수는 :"+scores[i]);
//		}
		
		// for-each 문
		for( int x : scores) {
			System.out.println(x+"번째 정수는 :"+ x);
		}
		
		// Arrays.toString
		 System.out.println(Arrays.toString(scores));
		 
		 
		 
		 // 평균
		 int sum =0;
		 for (int num : scores) {
			 sum = sum + num; // sum += num		 
		 }
		 System.out.println(sum/5);
	}
	

}
