package Java_서울_06_송윤제;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 상품 금액 입력
		int price = sc.nextInt();
		
		// 거스름돈 계산
		int change = 10000-price;
		
		// Th:1000의 자리수, H:100의 자리수, T:10의 자리수
		int Th = change/1000;
		int H = (change%1000)/100;
		int T = ((change%1000)%100)/10;
		
		
		// 반환할 각각의 거스름돈 개수 출력
		System.out.println("투입금액: 10000원");
		System.out.println("상품금액: "+price+"원");
		System.out.println("거스름돈: "+change+"원");
		System.out.println("------------------------");
		System.out.println("1000원: "+Th);
		
		// 100의 자리수가 5이상이면 500원 동전 사용, 그 외에는 100원 동전만 사용
		if(H>=5) {
			System.out.println("500원: "+1);
			System.out.println("100원: "+(H-5));
		}
		else {
			System.out.println("500원: "+0);
			System.out.println("100원: "+H);
		}
		System.out.println("10원: "+T);
	}

}
