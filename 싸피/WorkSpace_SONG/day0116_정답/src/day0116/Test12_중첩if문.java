package day0116;

public class Test12_중첩if문 {
	public static void main(String[] args) {
		// score에 따라서 학점을 매겨보기
		int score = 98;
		/*
		if(score >= 90) {
			System.out.println("A");
		} else {
			if (score >= 80) {
				System.out.println("B");
			} else {
				if(score >= 70) {
					System.out.println("C");
				} else {
					System.out.println("F");
				}
			}
		}
		*/
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >=70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
}
