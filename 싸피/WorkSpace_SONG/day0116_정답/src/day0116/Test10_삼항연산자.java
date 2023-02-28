package day0116;

public class Test10_삼항연산자 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1; // 1부터 10까지의 정수
		System.out.println("num은 짝수일까요? 홀수일까요? num:"+num);
		System.out.println(num % 2 == 0 ? "짝수": "홀수");
		
		int i = 3;
		i += 3;
		System.out.println(i);
		i *= 8;
		System.out.println(i);
	}
}
