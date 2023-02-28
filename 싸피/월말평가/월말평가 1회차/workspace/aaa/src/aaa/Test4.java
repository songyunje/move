package aaa;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		int change = 10000-price;
		
		int Th = change/1000;
		int H = (change%1000)/100;
		int T = ((change%1000)%100)/10;
		
		System.out.println("투입금액: 10000원");
		System.out.println("상품금액: "+price+"원");
		System.out.println("거스름돈: "+change+"원");
		System.out.println("------------------------");
		System.out.println("1000원: "+Th);
		if(H>5) {
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
