package day0116;

public class Test17_break {
	public static void main(String[] args) {
		// 반복문을 빠져나올 때 씁니다.
		for(int i=0; i<10; i++) {
			if(i==3) break;
			System.out.println(i);
		}
		outer: for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				if (i==1 && j==1)
					break outer;
				System.out.println(i+","+j);
			}
		}
	}
}
