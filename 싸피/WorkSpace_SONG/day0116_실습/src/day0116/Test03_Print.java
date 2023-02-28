package day0116;

public class Test03_Print {
	public static void main(String[] args) {
		// print : "문자열"
		// ptritln ; "문자열" + "\n"
		// printf : %d, %s, %c, ... 형식지정자
		System.out.print("HELLO SSAFY!\n");
		System.out.print("Hello Great 9th!\n");
		
		System.out.println("\\");
		System.out.println("\"");
		
		System.out.printf("%d\n", 10);    // 숫자 출력
		System.out.printf("%4d\n", 10);   // 4칸을 확보한 다음 숫자 출력
		System.out.printf("%-4d\n", 10);  // 숫자 다음 4칸 확보
		System.out.printf("%04d\n", 10);  // 4칸 확보, 빈 자리에는 0 출력
		
		System.out.printf("%f\n", 10.1);  // 소수 점 아래 6자리까지
		System.out.printf("%f\n", 10.12345678);	// 소수 점 아래 6자리까지인데 반올림
		System.out.printf("%.2f\n", 10.12845678 ); // 소수 점 아래 2자리까지 반올림
	}
}
