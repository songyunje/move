package 피라미드;

public class 피라미드 {
	public static void main(String[] args) {
		int N = 1;
		for (int i=0; i<5;i++) {
			for(int j=0;j<9;j++) {
				if(j>=4-i && j<5+i) {
					System.out.printf("%3d",N++);
				}
				else {
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
	}

}
