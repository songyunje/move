
public class Test07_2차원배열선언 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		//int[] arr[] = new int[3][4]
		
		
		
		// 행: 2차원 배열의 크기 = 길이
		// 열: 1차원 배열의 크기 = 길이
		for(int r=0; r<3; r++) {
			for(int c=0;c<4;c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
	}

}
