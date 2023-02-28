package day0116;

public class Test13_switch문 {
	public static void main(String[] args) {
		char grade = 'Y'; 
		
		switch(grade) {
		case 'A':
			System.out.println("90점 이상이시네요.");
			break;
		case 'B':
			System.out.println("80점 이상이시군요.");
			break;
		case 'C':
		case 'F':
			System.out.println("80점 미만이시군요.");
			break;
		default:
			System.out.println("무슨 학점인지 모르겠어요.");
		}
	}
}
