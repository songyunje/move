package day0116;

public class Test03_Print {
	public static void main(String[] args) {
		// print : "문자열"
		// println : "문자열" + "\n"
		// printf : %d, %s, ... -> format 지정
		
		System.out.print("Hello World!\n");
		System.out.print("Hello Great 9!\n");
		
		System.out.println("\\");
		System.out.println("\"");
		
		System.out.printf("%d\n", 10); // 정수(십진수)를 출력
		System.out.printf("%4d\n", 10); // 4칸을 확보한 다음, 오른쪽 정렬해서 출력
		System.out.printf("%-4d\n", 10); // 4칸을 확보한 다음, 왼쪽부터 채워넣음
		System.out.printf("%04d\n", 10); // 4칸을 확보한 다음, 오른쪽부터 채워넣음, 남는 자리는 0을 채워넣음.
		
		System.out.printf("%o\n", 10); // 8진수
		System.out.printf("%x\n", 10); // 16진수
		System.out.printf("%X\n", 10); // 16진수 대문자
		
		System.out.printf("%f\n", 10.1); // 실수(소수점 여섯번째자리)
		System.out.printf("%f\n", 10.12345678); // 소수점 여섯번째자리 <- 일곱번째자리에서 반올림
		System.out.printf("%.2f\n", 10.1); // 실수(소수점 둘째자리까지) <- 셋째자리에서 반올림
		System.out.printf("%.2f\n", 10.12345678);
		
		System.out.printf("%s\n", "이승재"); // 문자열
		System.out.printf("%c\n", 'A'); // 문자
		
		System.out.printf("안녕하세요. 저는 %s입니다. 제 혈액형은 %c입니다. MBTI는 %s예요.", "이승재", 'A', "ISFP"); // 형식 지정자를 여려개 쓸 수도 있음
		
	}

}










