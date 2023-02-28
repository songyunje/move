package day0116;

public class Test18_continue {
	public static void main(String[] args) {
		// 건너뛰고 다음 반복으로 넘어갈 때 씁니다.
		for(int i=0; i<10; i++) {
			if(i==3) continue;
			System.out.println(i);
		}
		outer: for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				if (i==1 && j==1)
					continue outer;
				System.out.println(i+","+j);
			}
		}
	}
}
