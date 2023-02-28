package test01;

public class Test4 {
	public static void main(String[] args) {
		// try ~ cath ~ catch
		try {
			int num = Integer.parseInt("ssafy");
			
			
			// 다중 예외처리를 할 때는 순서가 중요!!!!
			// 자식 예외를 먼저 검사하고, 나중에 큰 예외를 검사
			
		}
		catch (Exception e) { // 모든 예외를 처리할 수 있는 블록
				  // 다형성이 적용
			System.out.println("여기서는 모든 예외가 처리 가능합니다.");
		}

//		catch (ArithmeticException e) {
//			System.out.println("해당 문자열은 정수로 바꿀 수가 없어요.");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 넘어갔네요.");
//		}
		
		
	}

}
